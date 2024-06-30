package edu.springsecurity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to my Springboot Application";
    }
    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public String users(){
        return "Authorized user";
    }
    @GetMapping("/manager")
    @PreAuthorize("hasRole('ADMIN')")
    public String admin(){
        return "Authorized admin";
    }
}
