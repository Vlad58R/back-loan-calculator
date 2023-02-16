package com.example.app.backloancalculator.service;

import com.example.app.backloancalculator.model.HousingLoanResponse;
import com.example.app.backloancalculator.model.domain.HousingLoanPayment;
import com.example.app.backloancalculator.persistance.LoanPercentage;
import com.example.app.backloancalculator.repository.PercentageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class HousingLoanService {

    @Autowired
    PercentageRepository percentageRepository;

    @Transactional
    public HousingLoanResponse getPercentageByType(String type, String amount, String years) {
        LoanPercentage loanPercentage = percentageRepository.findByType(type);
        HousingLoanResponse response = new HousingLoanResponse();
        try {
            Double a = Double.parseDouble(amount);
            Double y = Double.parseDouble(years);
            List<HousingLoanPayment> payments = new ArrayList<>();
            payments.add(new HousingLoanPayment(1, loanPercentage.getPercent() * a * y));
            response.setPayments(payments);
        } catch (Exception e) {
            response.setErrorMessage(e.getMessage());
        }

        return response;
    }
}
