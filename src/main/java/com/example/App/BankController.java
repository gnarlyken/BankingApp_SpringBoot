package com.example.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankController {

    private static final Logger logger = LoggerFactory.getLogger(BankController.class);

    @Autowired
    private BankService bankService;



    @PostMapping("/create-account")
    public String createAccount(@RequestParam String name, @RequestParam double balance){
        // Create the bank account here using the provided name and balance
        BankAccount account = new BankAccount(name, balance);
        bankService.createAccount(name, balance);
        return "redirect:/congratulations?id=" + account.getId();
    }

}
