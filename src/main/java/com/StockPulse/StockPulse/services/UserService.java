package com.StockPulse.StockPulse.services;

import com.StockPulse.StockPulse.models.User;

public interface UserService {
    User createUser(String username, String password, String email);
    User loginUser(String username, String password);
    void logoutUser(User user);
}
