package com.example.BankApp.repository;

import com.example.BankApp.model.BankBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BankBranchRepository extends JpaRepository<BankBranch, Long> {
}
