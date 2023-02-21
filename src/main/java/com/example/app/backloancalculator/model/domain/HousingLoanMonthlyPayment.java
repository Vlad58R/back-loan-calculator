package com.example.app.backloancalculator.model.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HousingLoanMonthlyPayment that = (HousingLoanMonthlyPayment) o;
        return Objects.equals(month, that.month) && Objects.equals(totalPayment, that.totalPayment) && Objects.equals(percentagePayment, that.percentagePayment) && Objects.equals(loanPayment, that.loanPayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, totalPayment, percentagePayment, loanPayment);
    }
}
