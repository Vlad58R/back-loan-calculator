package com.example.app.backloancalculator.service;

import com.example.app.backloancalculator.enums.LoanTypes;
import com.example.app.backloancalculator.model.HousingLoanResponse;
import com.example.app.backloancalculator.model.domain.HousingLoanMonthlyPayment;
import com.example.app.backloancalculator.model.domain.HousingLoanPayment;
import com.example.app.backloancalculator.persistance.LoanPercentage;
import com.example.app.backloancalculator.repository.PercentageRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class HousingLoanServiceTest {

    @TestConfiguration
    static class HousingLoanServiceTestContextConfiguration {

        @Bean
        public HousingLoanService housingLoanService() {
            return new HousingLoanService();
        }
    }

    @Autowired
    private HousingLoanService housingLoanService;

    @MockBean
    private PercentageRepository percentageRepository;

    @Before
    public void setUp() {
        LoanPercentage housingPercentage = new LoanPercentage(1, 3.5, "housing");

        Mockito.when(percentageRepository.findByType(LoanTypes.housing.getValue()))
                .thenReturn(housingPercentage);
    }

    @Test
    public void should_return_response() {
        List<HousingLoanMonthlyPayment> housingLoanMonthlyPayments = new ArrayList<>();
        housingLoanMonthlyPayments.add(new HousingLoanMonthlyPayment(1, 84.92162984406758, 2.916666666666667, 82.00496317740091));
        housingLoanMonthlyPayments.add(new HousingLoanMonthlyPayment(2, 84.92162984406758, 2.677485524065914, 82.24414432000167));
        housingLoanMonthlyPayments.add(new HousingLoanMonthlyPayment(3, 84.92162984406758, 2.4376067697992427, 82.48402307426834));
        housingLoanMonthlyPayments.add(new HousingLoanMonthlyPayment(4, 84.92162984406758, 2.1970283691659604, 82.72460147490162));
        housingLoanMonthlyPayments.add(new HousingLoanMonthlyPayment(5, 84.92162984406758, 1.9557482815308305, 82.96588156253675));
        housingLoanMonthlyPayments.add(new HousingLoanMonthlyPayment(6, 84.92162984406758, 1.7137644603067648, 83.20786538376082));
        housingLoanMonthlyPayments.add(new HousingLoanMonthlyPayment(7, 84.92162984406758, 1.4710748529374624, 83.45055499113012));
        housingLoanMonthlyPayments.add(new HousingLoanMonthlyPayment(8, 84.92162984406758, 1.2276774008799998, 83.69395244318758));
        housingLoanMonthlyPayments.add(new HousingLoanMonthlyPayment(9, 84.92162984406758, 0.9835700395873692, 83.93805980448022));
        housingLoanMonthlyPayments.add(new HousingLoanMonthlyPayment(10, 84.92162984406758, 0.7387506984909685, 84.1828791455766));
        housingLoanMonthlyPayments.add(new HousingLoanMonthlyPayment(11, 84.92162984406758, 0.4932173009830368, 84.42841254308455));
        housingLoanMonthlyPayments.add(new HousingLoanMonthlyPayment(12, 84.92162984406758, 0.24696776439904017, 84.67466207966854));
        HousingLoanPayment housingLoanPayment = new HousingLoanPayment(1019.059558128811, 19.059558128810977, 1000.00, housingLoanMonthlyPayments);
        HousingLoanResponse housingLoanResponse = new HousingLoanResponse(housingLoanPayment, null);

        var response = housingLoanService.getPercentageByType(LoanTypes.housing.getValue(), "1000", "1");

        assertNotNull(response);
        assertEquals(response, housingLoanResponse);
    }
}