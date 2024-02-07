package com.StockPulse.StockPulse.controller;


import com.StockPulse.StockPulse.models.User;
import com.StockPulse.StockPulse.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


public class UserController {
    private final UserService userService;

    public  UserController(UserService userService){
        this.userService = new userService;
    }

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    public User registerUser(@RequestParam String username, @RequestParam String email, @RequestParam String password){
        return userService.createUser(username,password,email);
    }

    @PostMapping("/login")
    public User loginUser(@RequestParam String username, @RequestParam String password){
        return userService.loginUser(username,password);
    }

    @PostMapping("/logout")
    public void logoutUser (@RequestBody User user){
        userService.logoutUser(user);
    }
}
