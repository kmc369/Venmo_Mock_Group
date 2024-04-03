package com.StockPulse.StockPulse.dao;

import com.StockPulse.StockPulse.models.LoginUserDTO;
import com.StockPulse.StockPulse.models.RegisterUserDTO;
import com.StockPulse.StockPulse.models.User;

import java.util.List;

// Will contain the CRUD methods to implement in the JDBC Layer without exposing details of database interation
//interation and maniupulation
public interface UserDao {
    // User findById(Long id);

    // List<User> findAll();

    void save(User user);

    // //TODO update user
    // void update(User user);

    //TODO delete user
    // void deleteById(Long id);

    // // TODO - Delete User
    // void deleteUser(Long userId);
}
