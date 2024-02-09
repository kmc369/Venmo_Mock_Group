package com.StockPulse.StockPulse.dao;


import com.StockPulse.StockPulse.BaseDaoTests;
import com.StockPulse.StockPulse.models.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;


public class JdbcUserDaoTests extends BaseDaoTests {



    // Create Mock Objects from the test-database
    @Before
    public void setup(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        JdbcUserDao dao = new JdbcUserDao(jdbcTemplate);
    }


    // Create test TODO
    @Test
    public void getUserWithNonExistingEmailReturnsError(){

    }


}

