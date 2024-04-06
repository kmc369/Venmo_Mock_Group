package com.StockPulse.StockPulse.service;

import com.StockPulse.StockPulse.BaseDaoTests;
import com.StockPulse.StockPulse.dao.JdbcUserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;


// Testing layer for the User Service Layer
public class UserServiceTests extends BaseDaoTests {

    // Create the Testing Objects






    // Create Mock Objects from the test-database
    @Before
    public void setup(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        JdbcUserDao dao = new JdbcUserDao(null, jdbcTemplate);
    }


    @Test
    public void nullUserFromServiceReturns404Response(){

    }


}
