package com.yellowfin.project.user;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class UserController {
    @CrossOrigin
    @GetMapping("/users")
    public String users() {
        return "{" +
                " \"status\": \"200\";" +
                "\"users\":[ \"Monica Amico\"]}";
    }

    @CrossOrigin
    @GetMapping("/currentUser")
    public String currentuser() {
        return "{" +
                "\"satus\": \"200\";" +
                "\"user\": \"Monica Amico\"" +
                "}";
    }
}
