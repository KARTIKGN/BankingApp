package com.example.BankApp.controller;

import com.example.BankApp.service.BankBranchService;
import com.example.BankApp.model.BankBranch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BankBranchController {
    @Autowired
    private BankBranchService bankBranchService;

    @GetMapping("/branches")
    public String getBranches(@RequestParam("bank") String bankName, Model model) {
        List<BankBranch> branches = bankBranchService.getAllBranches();
        model.addAttribute("branches", branches);
        model.addAttribute("bankName", bankName); // Add bank name to model
        return "branches"; // Thymeleaf template name
    }
}
