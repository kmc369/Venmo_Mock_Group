package com.StockPulse.StockPulse.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


// Represents the Object that gets passed from the front-end to the back-end for login
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LoginUserDTO {

    private String username;
    private String password;

}
