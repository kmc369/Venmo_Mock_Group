package com.StockPulse.StockPulse.dao;


import com.StockPulse.StockPulse.BaseDaoTests;
import com.StockPulse.StockPulse.models.LoginUserDTO;
import com.StockPulse.StockPulse.models.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;


public class JdbcUserDaoTests extends BaseDaoTests {

    // This comes from the actual insert statement from sql
    private static final User TEST_USER = new User(Long.parseLong("1"),"John Doe","Hello");

    // this is the mock DTO that gets passed into the method to get users from the JDBC User Dao
    private static final LoginUserDTO TEST_DTO = new LoginUserDTO("John Doe","Hello");



    private JdbcUserDao dao;

    @Before
    public void setup(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        dao = new JdbcUserDao(jdbcTemplate);
    }



    // Create test TODO
    @Test
    public void getUserWithNonExistingEmailReturnsError(){

    }

    @Test
    public void getUserWithValidUsernameReturnCorrectUser(){
        Assert.assertEquals(TEST_USER, dao.getUserForLogin(TEST_DTO));
    }


}

