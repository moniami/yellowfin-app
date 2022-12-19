package com.yellowfin.project.user;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {
    @CrossOrigin
    @GetMapping("/users")
    public String users() {
        return "Users ";
    }
}
