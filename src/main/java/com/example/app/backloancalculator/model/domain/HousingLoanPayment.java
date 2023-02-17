package com.example.app.backloancalculator.model.domain;

import java.util.List;

public class HousingLoanPayment {
    private Double totalPayment;
    private Double percentagePayment;
    private Double loanPayment;
    private List<HousingLoanMonthlyPayment> housingLoanMonthlyPayments;


    public HousingLoanPayment() {
    }

    public HousingLoanPayment(Double totalPayment,
                              Double percentagePayment,
                              Double loanPayment,
                              List<HousingLoanMonthlyPayment> housingLoanMonthlyPayments) {
        this.totalPayment = totalPayment;
        this.percentagePayment = percentagePayment;
        this.loanPayment = loanPayment;
        this.housingLoanMonthlyPayments = housingLoanMonthlyPayments;
    }

    public Double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public Double getPercentagePayment() {
        return percentagePayment;
    }

    public void setPercentagePayment(Double percentagePayment) {
        this.percentagePayment = percentagePayment;
    }

    public Double getLoanPayment() {
        return loanPayment;
    }

    public void setLoanPayment(Double loanPayment) {
        this.loanPayment = loanPayment;
    }

    public List<HousingLoanMonthlyPayment> getHousingLoanMonthlyPayments() {
        return housingLoanMonthlyPayments;
    }

    public void setHousingLoanMonthlyPayments(List<HousingLoanMonthlyPayment> housingLoanMonthlyPayments) {
        this.housingLoanMonthlyPayments = housingLoanMonthlyPayments;
    }
}
