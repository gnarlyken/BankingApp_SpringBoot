package com.example.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankService {
    private final BankAccountRepository bankAccountRepository;

    @Autowired
    public BankService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public void createAccount(String name, double balance) {
        BankAccount account = new BankAccount(name, balance);
        bankAccountRepository.save(account);
    }

}
