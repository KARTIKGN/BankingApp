package com.example.BankApp.service.impl;

import com.example.BankApp.service.BankBranchService;
import com.example.BankApp.model.BankBranch;
import com.example.BankApp.repository.BankBranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankBranchServiceImpl implements BankBranchService {
    @Autowired
    private BankBranchRepository repository;

    @Override
    public List<BankBranch> getAllBranches() {
        return repository.findAll();
    }
}
