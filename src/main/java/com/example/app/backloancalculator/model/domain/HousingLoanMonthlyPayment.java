package com.example.app.backloancalculator.model.domain;

public class HousingLoanMonthlyPayment {
    private Integer month;
    private Double totalPayment;
    private Double percentagePayment;
    private Double loanPayment;


    public HousingLoanMonthlyPayment() {
    }

    public HousingLoanMonthlyPayment(Integer month,
                                     Double totalPayment,
                                     Double percentagePayment,
                                     Double loanPayment) {
        this.month = month;
        this.totalPayment = totalPayment;
        this.percentagePayment = percentagePayment;
        this.loanPayment = loanPayment;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
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
}
