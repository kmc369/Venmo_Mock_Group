package com.StockPulse.StockPulse.dao;


import com.StockPulse.StockPulse.models.LoginUserDTO;
import com.StockPulse.StockPulse.models.RegisterUserDTO;
import com.StockPulse.StockPulse.models.User;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


/*
   Implements the CRUD operations from the UserDao interface and will pass
   objects to the UserService to encapsulate it then pass it to the controller.
*/


@AllArgsConstructor
@Component
public class JdbcUserDao implements UserDao {

    //JDBC Connectivity Object
    private JdbcTemplate jdbcTemplate;

    @Override
    public void RegisterUser(RegisterUserDTO dto) {

        // TODO - Create User logic implementation

    }

    @Override
    public void editUser(User user) {

        // TODO - Update User logic implementation

    }

    @Override
    public User getUserForLogin(LoginUserDTO dto) {

        // TODO - Read/Get User logic implementation

        return null;
    }

    @Override
    public void deleteUser(Long userId) {

        // TODO - Delete User logic implementation

    }






}
