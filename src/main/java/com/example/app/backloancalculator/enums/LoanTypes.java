package com.example.app.backloancalculator.enums;

public enum LoanTypes {
    housing("housing"),
    leasing("leasing");

    private final String value;

    LoanTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
