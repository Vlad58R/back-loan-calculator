package com.example.app.backloancalculator.model;

import com.example.app.backloancalculator.model.domain.HousingLoanPayment;

import java.util.List;

public class HousingLoanResponse {
    private List<HousingLoanPayment> payments;
    private String errorMessage;

    public HousingLoanResponse() {
    }

    public HousingLoanResponse(List<HousingLoanPayment> payments) {
        this.payments = payments;
    }

    public HousingLoanResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<HousingLoanPayment> getPayments() {
        return payments;
    }

    public void setPayments(List<HousingLoanPayment> payments) {
        this.payments = payments;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
