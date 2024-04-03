package com.StockPulse.StockPulse.dao;

import org.springframework.stereotype.Repository;

import com.StockPulse.StockPulse.models.LoginUserDTO;
import com.StockPulse.StockPulse.models.RegisterUserDTO;
import com.StockPulse.StockPulse.models.User;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.List;




@AllArgsConstructor
@Component
public class JdbcUserDao implements UserDao {

    //find user by identifier
    private static final String SQL_FIND_BY_ID = "SELECT * FROM users WHERE id = ?";
    //find all users
    private static final String SQL_FIND_ALL = "SELECT * FROM users";
    //insert new user to database
    private static final String SQL_INSERT = "INSERT INTO users (username, password, email, last_login) VALUES (?, ?, ?, ?)";
    //update an existing user to database
    private static final String SQL_UPDATE = "UPDATE users SET username = ?, password = ?, email = ?, last_login = ? WHERE id = ?";
    //delete user by identifer
    private static final String SQL_DELETE_BY_ID = "DELETE FROM users WHERE id = ?";

    //JDBC Connectivity Object
    private JdbcTemplate jdbcTemplate;

    // @Override
    // public User findById(Long id) {
    //     return null;
    // }

    // @Override
    // public List<User> findAll() {
    //     return null;
    // }


 
    public void save(User user) {
        
    }

    // @Override
    // public void update(User user) {
    //     // TODO - Read/Get User logic implementation
    //     var sql = "SELECT user_id , username, password FROM users WHERE username = ?;";
    //     user = null;
    //     try{
    //         SqlRowSet result = jdbcTemplate.queryForRowSet(sql, dto.getUsername());
    //         if (result.next()){
    //             user = mapToUser(result);
    //         }
    //     } catch (Exception e){
    //         System.out.println("Error in User Query");
    //     }
    //     return user;
    // }

    // @Override
    // public void deleteUser(Long userId) {
    //     // TODO - Delete User logic implementation

    // }

    // @Override
    // public void deleteById(Long id) {

    // }

    private User mapToUser(SqlRowSet rs){
        return new User(
                rs.getLong("user_id"),
                rs.getString("username"),
                rs.getString("password")
        );
    }
}
