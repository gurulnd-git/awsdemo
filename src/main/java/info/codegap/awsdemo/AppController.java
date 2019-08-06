package info.codegap.awsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/welcome")
    public String welcomePage() {
        return "Welcome to EBS web app";
    }
}
