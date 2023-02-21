package com.example.app.backloancalculator.model;

import com.example.app.backloancalculator.model.domain.HousingLoanPayment;

import java.util.Objects;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HousingLoanResponse response = (HousingLoanResponse) o;
        return Objects.equals(housingLoanPayment, response.housingLoanPayment) && Objects.equals(errorMessage, response.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(housingLoanPayment, errorMessage);
    }
}
