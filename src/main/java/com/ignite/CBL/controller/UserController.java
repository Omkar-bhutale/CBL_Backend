package com.ignite.CBL.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/greet")
    public String greetUser() {
        return "Hello, User! Welcome to our application.";
    }

    @GetMapping("/admin/greet")
    public String greetAdmin() {
        return "Hello, Admin! You have administrative privileges.";
    }
}
