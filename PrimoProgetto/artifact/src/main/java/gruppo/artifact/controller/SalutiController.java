package gruppo.artifact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalutiController {
    
    @GetMapping("/saluti")
    public String saluti() {
        return "Ciao!";
    }
}
