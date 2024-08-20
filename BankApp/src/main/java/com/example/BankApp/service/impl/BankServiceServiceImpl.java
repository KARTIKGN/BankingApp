package com.example.BankApp.service.impl;

import com.example.BankApp.model.BankService;
import com.example.BankApp.repository.BankServiceRepository;
import com.example.BankApp.service.BankServiceService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BankServiceServiceImpl implements BankServiceService {

    private final BankServiceRepository bankServiceRepository;

    public BankServiceServiceImpl(BankServiceRepository bankServiceRepository) {
        this.bankServiceRepository = bankServiceRepository;
    }

    @Override
    public List<BankService> getAllServices() {
        return bankServiceRepository.findAll();
    }
}
