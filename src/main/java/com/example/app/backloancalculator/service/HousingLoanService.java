package com.example.app.backloancalculator.service;

import com.example.app.backloancalculator.model.HousingLoanResponse;
import com.example.app.backloancalculator.model.domain.HousingLoanMonthlyPayment;
import com.example.app.backloancalculator.model.domain.HousingLoanPayment;
import com.example.app.backloancalculator.persistance.LoanPercentage;
import com.example.app.backloancalculator.repository.PercentageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HousingLoanService {

    @Autowired
    PercentageRepository percentageRepository;

    public HousingLoanResponse getPercentageByType(String type, String amount, String years) {
        LoanPercentage loanPercentage = percentageRepository.findByType(type);
        HousingLoanResponse response = new HousingLoanResponse();

        try {
            Double a = Double.parseDouble(amount);
            Double y = Double.parseDouble(years);
            HousingLoanPayment housingLoanPayment = calculatePayments(a, y, loanPercentage.getPercent());
            response.setHousingLoanPayment(housingLoanPayment);
        } catch (Exception e) {
            response.setErrorMessage("Something went wrong, please try again");
        }

        return response;
    }

    private HousingLoanPayment calculatePayments(Double amount, Double years, Double yearlyPercent) {
        Double monthlyPercent = yearlyPercent / 12 / 100;
        Double totalPercent = Math.pow((1 + monthlyPercent), (years * 12));
        Double monthlyPayment = (amount * monthlyPercent * totalPercent) / (totalPercent - 1);
        Double loanLeft = amount;

        List<HousingLoanMonthlyPayment> housingLoanMonthlyPayments = new ArrayList<>();
        for (int monthCounter = 1; monthCounter <= years * 12; monthCounter++) {
            Double percentagePart = loanLeft * monthlyPercent;
            Double loanPart = monthlyPayment - percentagePart;
            loanLeft -= loanPart;
            housingLoanMonthlyPayments.add(new HousingLoanMonthlyPayment(monthCounter, monthlyPayment, percentagePart, loanPart));
        }

        Double totalPaymeny = monthlyPayment * years * 12;
        Double totalPercentagePayment = totalPaymeny - amount;

        HousingLoanPayment housingLoanPayment = new HousingLoanPayment(totalPaymeny, totalPercentagePayment, amount, housingLoanMonthlyPayments);

        return housingLoanPayment;
    }
}
