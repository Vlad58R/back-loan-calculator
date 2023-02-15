package com.example.app.backloancalculator.controller.spec;

import com.example.app.backloancalculator.constants.ApiConstants;
import com.example.app.backloancalculator.constants.ApplicationConstants;
import com.example.app.backloancalculator.model.HousingLoanResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public interface HousingLoan {

    String url = ApiConstants.URL_HOUSING;

    String PARAM_AMOUNT = ApplicationConstants.PARAM_AMOUNT;
    String PARAM_YEARS = ApplicationConstants.PARAM_YEARS;

    @GetMapping(url)
    @ResponseStatus(HttpStatus.OK)
    HousingLoanResponse getHousingLoan(
            @RequestParam(value = PARAM_AMOUNT) final String amount,
            @RequestParam(value = PARAM_YEARS) final String years
    );
}
