package com.example.BankApp.controller;

import com.example.BankApp.model.BankService;
import com.example.BankApp.service.BankServiceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BankServiceController {
    private String bankName;

    private final BankServiceService bankServiceService;

    public BankServiceController(BankServiceService bankServiceService) {
        this.bankServiceService = bankServiceService;
    }

    @GetMapping("/services")
    public String getServices(@RequestParam String bank ,Model model) {
        List<BankService> services = bankServiceService.getAllServices();
        model.addAttribute("services", services);
        model.addAttribute("bankName", bank);
        return "services";  // returns the 'services.html' page
    }
}
