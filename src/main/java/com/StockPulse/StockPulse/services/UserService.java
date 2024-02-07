package com.StockPulse.StockPulse.services;

import com.StockPulse.StockPulse.models.User;

public interface UserService {
    User login(String username, String password);
    void logout(User user);
}
