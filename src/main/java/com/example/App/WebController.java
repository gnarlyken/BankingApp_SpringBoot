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


    @GetMapping("/options")
    public String optionsPage() {
        return "options";
    }

    @GetMapping("/deposit")
    public String depositPage() {
        return "deposit";
    }

    @GetMapping("/withdraw")
    public String withdrawPage() {
        return "withdraw";
    }

    @GetMapping("/congratulations")
    public String congratsPage() {
        return "congratulations";
    }

    @GetMapping("/actionDone")
    public String actionDonePage(){
        return "actionDone";
    }
}
