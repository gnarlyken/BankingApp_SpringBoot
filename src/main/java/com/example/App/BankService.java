package com.example.App;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankService {
    private final BankAccountRepository bankAccountRepository;

    @Autowired
    public BankService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
    @Transactional
    public BankAccount createAccount(String name, double balance) {
        BankAccount account = new BankAccount(name, balance);
        return bankAccountRepository.save(account); // Return the saved BankAccount object
    }
    @Transactional
    public void deposit(Long accountId, double amount) {
        BankAccount account = bankAccountRepository.findById(accountId)
                .orElseThrow(() -> new IllegalArgumentException("Account not found"));

        double currentBalance = account.getBalance();
        double newBalance = currentBalance + amount;
        account.setBalance(newBalance);

        bankAccountRepository.save(account);
    }
    }

