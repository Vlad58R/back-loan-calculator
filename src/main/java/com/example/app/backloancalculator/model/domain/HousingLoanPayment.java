package com.example.app.backloancalculator.model.domain;

public class HousingLoanPayment {
    private Double total;

    public HousingLoanPayment(Double total) {
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
