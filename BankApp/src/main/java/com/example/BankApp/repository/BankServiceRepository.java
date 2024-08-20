package com.example.BankApp.repository;

import com.example.BankApp.model.BankService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankServiceRepository extends JpaRepository<BankService, Long> {
}
