package com.StockPulse.StockPulse.services;

import com.StockPulse.StockPulse.dao.JdbcUserDao;
import com.StockPulse.StockPulse.models.LoginUserDTO;
import com.StockPulse.StockPulse.models.RegisterUserDTO;
import com.StockPulse.StockPulse.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    /*
    This Class is responsible to return the Response Entity to the controller
    which will contain the User Object Plus the Response Code all in one
    */

    @Autowired
    private JdbcUserDao dao;


    //Returns User from the login Endpoint TODO
    public ResponseEntity<User> returnsUserForLogin(LoginUserDTO dto){

        // return user from the dao
        dao.

        return ResponseEntity.ok(new User());
    }



    // Accepts the Information required to register User TODO
    public ResponseEntity<?> returnsResponseForRegisteringUser(RegisterUserDTO dto){

        // return the value if there is any from the dao

        return ResponseEntity.ok(new User());

    }

}
