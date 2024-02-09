package com.StockPulse.StockPulse.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

// Represents the Object that gets passed from the front-end to the back-end for register
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class RegisterUserDTO {

    private String username;
    private String email;
    private String password;

}
