package com.StockPulse.StockPulse.dao;


import com.StockPulse.StockPulse.controller.UserController;
import com.StockPulse.StockPulse.models.LoginUserDTO;
import com.StockPulse.StockPulse.models.RegisterUserDTO;
import com.StockPulse.StockPulse.models.User;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;


/*
   Implements the CRUD operations from the UserDao interface and will pass
   objects to the UserService to encapsulate it then pass it to the controller.
*/


@AllArgsConstructor
@Component
public class JdbcUserDao implements UserDao {

    //find user by identifier
    private static final String SQL_FIND_BY_ID = "SELECT * FROM users WHERE id = ?";
    //find all users
    private static final String SQL_FIND_ALL = "SELECT * FROM users";
    //insert new user to database
    private static final String SQL_INSERT = "INSERT INTO users (user_id, username, password) VALUES (?, ?, ?)";
    //update an existing user to database
    private static final String SQL_UPDATE = "UPDATE users SET user_id = ?, username = ?, password = ? WHERE id = ?";
    //delete user by identifer
    private static final String SQL_DELETE_BY_ID = "DELETE FROM users WHERE id = ?";

    //StockController Object
    private UserController userController;

    //JDBC Connectivity Object
    private JdbcTemplate jdbcTemplate;

    @Override
    public void RegisterUser(RegisterUserDTO dto) {

        // TODO - Create User logic implementation
        userController.registerUser(dto);
        var sql = SQL_INSERT;
        try {
            jdbcTemplate.update(sql, dto);
        } catch (Exception e) {
            System.out.println("Error in User Creation");
        }
    }

    @Override
    public void editUser(User user) {

        // TODO - Update User logic implementation
        var sql = SQL_UPDATE;
        try {
            jdbcTemplate.update(sql, user);
        } catch (Exception e) {
            System.out.println("Error in Updating User");
        }
    }


    @Override
    public User getUserForLogin(LoginUserDTO dto) {

        // TODO - Read/Get User logic implementation
        var sql = "SELECT user_id, username, password FROM users WHERE username = ?;";
        User user = null;
        try{
            SqlRowSet result = jdbcTemplate.queryForRowSet(sql, dto.getUsername());
            if (result.next()){
                user = mapToUser(result);
            }
        } catch (Exception e) {
            System.out.println("Error in User Query");
        }
        return user;
    }

    @Override
    public void deleteUser(long userId) {

        // TODO - Delete User logic implementation
        var sql = SQL_DELETE_BY_ID;
        try {
            jdbcTemplate.update(sql, userId);
        } catch (Exception e) {
            System.out.println("Error in Deleting User");
        }
    }


    private User mapToUser(SqlRowSet rs){
        return new User(
                rs.getLong("user_id"),
                rs.getString("username"),
                rs.getString("password")
        );
    }





}
