package com.example.app.backloancalculator.model.domain;

public class HousingLoanPayment {
    private Integer month;
    private Double total;

    public HousingLoanPayment() {
    }

    public HousingLoanPayment(Integer month, Double total) {
        this.month = month;
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }
}
