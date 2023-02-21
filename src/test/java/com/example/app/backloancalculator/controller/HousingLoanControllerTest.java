package com.example.app.backloancalculator.controller;

import com.example.app.backloancalculator.enums.LoanTypes;
import com.example.app.backloancalculator.model.HousingLoanResponse;
import com.example.app.backloancalculator.service.HousingLoanService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(HousingLoanController.class)
public class HousingLoanControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private HousingLoanService housingLoanService;

    @Test
    public void should_return_status_ok() throws Exception {
        given(housingLoanService.getPercentageByType(LoanTypes.housing.getValue(), "1000", "1")).willReturn(new HousingLoanResponse());

        mvc.perform(get("/loan/housing?amount=1000&years=1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void should_return_status_bad_request_when_no_params() throws Exception {
        given(housingLoanService.getPercentageByType(LoanTypes.housing.getValue(), "1000", "1")).willReturn(new HousingLoanResponse());

        mvc.perform(get("/loan/housing")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void should_return_status_not_found_when_url_incorrect() throws Exception {
        given(housingLoanService.getPercentageByType(LoanTypes.housing.getValue(), "1000", "1")).willReturn(new HousingLoanResponse());

        mvc.perform(get("/test/incorrect/url")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
}
