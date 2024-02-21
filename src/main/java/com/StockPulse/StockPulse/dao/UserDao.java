package com.StockPulse.StockPulse.dao;

import com.StockPulse.StockPulse.models.LoginUserDTO;
import com.StockPulse.StockPulse.models.RegisterUserDTO;
import com.StockPulse.StockPulse.models.User;

// Will contain the CRUD methods to implement in the JDBC Layer
public interface UserDao {


    // TODO - Create User
    void RegisterUser(RegisterUserDTO dto);


    // TODO - Update User
    void editUser(User user);


    // TODO - Read/Get User
    User getUserForLogin(LoginUserDTO dto);


    // TODO - Delete User
    void deleteUser(long userId);

}
