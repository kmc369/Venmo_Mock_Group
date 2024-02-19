package com.StockPulse.StockPulse.dao;


import com.StockPulse.StockPulse.models.LoginUserDTO;
import com.StockPulse.StockPulse.models.RegisterUserDTO;
import com.StockPulse.StockPulse.models.Stock;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


/*
   Implements the CRUD operations from the UserDao interface and will pass
   objects to the UserService to encapsulate it then pass it to the controller.
*/


@AllArgsConstructor
@Component
public class JdbcUserDao implements CartDao {

    //JDBC Connectivity Object
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addStockToCart(RegisterUserDTO dto) {

        // TODO - Create User logic implementation

    }

    


    @Override
    public void deleteStockFromCart(int userId) {

        // TODO - Delete User logic implementation

    }






}
