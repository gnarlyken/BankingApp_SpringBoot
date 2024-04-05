package com.example.App;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double balance;

    // Constructors, getters, and setters
    public BankAccount(String id, String name, double balance) {}

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String accountNumber) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

