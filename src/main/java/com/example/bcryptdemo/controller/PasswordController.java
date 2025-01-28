package com.example.bcryptdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PasswordController {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/hash")
    public String hashPassword(@RequestParam String password, Model model) {
        if (password == null || password.trim().isEmpty()) {
            model.addAttribute("error", "Password cannot be empty");
            return "index";
        }
        
        String hashedPassword = passwordEncoder.encode(password);
        model.addAttribute("hash", hashedPassword);
        return "index";
    }

    @PostMapping("/verify")
    public String verifyPassword(
            @RequestParam String password,
            @RequestParam String hash,
            Model model) {
        
        if (password == null || password.trim().isEmpty() || hash == null || hash.trim().isEmpty()) {
            model.addAttribute("verificationError", "Both password and hash are required");
            return "index";
        }

        boolean matches = passwordEncoder.matches(password, hash);
        model.addAttribute("verificationResult", matches ? "Hash matches!" : "Hash does not match!");
        return "index";
    }
}
