package com.example.App;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }


    @GetMapping("/create-account")
    public String createAccountPage() {
        return "create-account";
    }

    @GetMapping("/congratulations")
    public String congratsPage() {
        return "congratulations";
    }

}
