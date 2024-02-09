package com.StockPulse.StockPulse.controller;

import com.StockPulse.StockPulse.models.LoginUserDTO;
import com.StockPulse.StockPulse.models.RegisterUserDTO;
import com.StockPulse.StockPulse.models.User;
import com.StockPulse.StockPulse.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;



    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegisterUserDTO dto){
        return userService.returnsResponseForRegisteringUser(dto);
    }



    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginUserDTO dto){
        return userService.returnsUserForLogin(dto);
    }

}
