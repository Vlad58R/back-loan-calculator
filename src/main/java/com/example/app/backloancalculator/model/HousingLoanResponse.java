package com.example.app.backloancalculator.model;

import com.example.app.backloancalculator.model.domain.HousingLoanPayment;


public class HousingLoanResponse {
    private HousingLoanPayment housingLoanPayment;
    private String errorMessage;

    public HousingLoanResponse() {
    }

    public HousingLoanResponse(HousingLoanPayment housingLoanPayment, String errorMessage) {
        this.housingLoanPayment = housingLoanPayment;
        this.errorMessage = errorMessage;
    }

    public HousingLoanPayment getHousingLoanPayment() {
        return housingLoanPayment;
    }

    public void setHousingLoanPayment(HousingLoanPayment housingLoanPayment) {
        this.housingLoanPayment = housingLoanPayment;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
