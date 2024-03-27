package com.StockPulse.StockPulse.dao;


import com.StockPulse.StockPulse.models.Stock;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/*
   Implements the CRUD operations from the UserDao interface and will pass
   objects to the UserService to encapsulate it then pass it to the controller.
*/


// @AllArgsConstructor
// @Component


@Repository
public class JdbcCartDao implements CartDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcCartDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addStockToCart(int stockId, int cartId) {
        String sql = "INSERT INTO cart_stock (cart_id, stock_id) VALUES (?, ?)";
        jdbcTemplate.update(sql, cartId, stockId);
    }

 
}
