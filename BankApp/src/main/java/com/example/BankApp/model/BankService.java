
package com.example.BankApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bank_services")
public class BankService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serviceName;
    private String description;

    // Constructors
    public BankService() {}

    public BankService(String serviceName, String description) {
        this.serviceName = serviceName;
        this.description = description;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
