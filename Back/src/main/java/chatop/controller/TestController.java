package chatop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String getTestMessage() {
        System.out.println("Méthode getTestMessage appelée");
        return "Ceci est un message de test pour votre API.";
    }
}
