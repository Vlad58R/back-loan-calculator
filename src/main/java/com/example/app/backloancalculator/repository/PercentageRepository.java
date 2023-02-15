package com.example.app.backloancalculator.repository;

import com.example.app.backloancalculator.persistance.LoanPercentage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PercentageRepository extends JpaRepository<LoanPercentage, Integer> {
    LoanPercentage findByType(String type);
}
