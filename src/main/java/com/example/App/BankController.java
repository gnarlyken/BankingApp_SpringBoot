package com.example.App;

import org.springframework.ui.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class BankController {

    private static final Logger logger = LoggerFactory.getLogger(BankController.class);

    @Autowired
    private BankService bankService;



    @PostMapping("/create-account")
    public String createAccount(@RequestParam String name, @RequestParam double balance) {
        // Create the bank account here using the provided name and balance
        BankAccount account = bankService.createAccount(name, balance);
        Long accountId = account.getId(); // Retrieve the ID from the saved account
        return "redirect:/congratulations?id=" + accountId;
    }

    @PostMapping("/deposit")
    public String deposit(@RequestParam Long accountId, @RequestParam double amount, RedirectAttributes redirectAttributes) {
        bankService.deposit(accountId, amount);

        redirectAttributes.addFlashAttribute("id", accountId);
        redirectAttributes.addFlashAttribute("message", "Deposit successful!");

        return "redirect:/actionDone";
    }





}

