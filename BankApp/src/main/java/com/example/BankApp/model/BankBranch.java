package com.example.BankApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bank_branches")
public class BankBranch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String branchName;
    private String branchAddress;
    private String city;

    // Constructors
    public BankBranch() {}

    public BankBranch(String branchName, String branchAddress, String city) {
        this.branchName = branchName;
        this.branchAddress = branchAddress;
        this.city = city;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
