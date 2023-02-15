package com.example.app.backloancalculator.controller;

import com.example.app.backloancalculator.constants.ApiConstants;
import com.example.app.backloancalculator.controller.spec.HousingLoan;
import com.example.app.backloancalculator.enums.LoanTypes;
import com.example.app.backloancalculator.model.HousingLoanResponse;
import com.example.app.backloancalculator.service.HousingLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiConstants.URL_LOAN, produces = "application/json")
public class HousingLoanController implements HousingLoan {

    @Autowired
    HousingLoanService housingLoanService;

    @Override
    public HousingLoanResponse getHousingLoan(String amount, String years) {
        return housingLoanService.getPercentageByType(LoanTypes.housing.getValue(), amount, years);
    }
}
