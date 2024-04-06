package com.StockPulse.StockPulse.services;

import com.StockPulse.StockPulse.dao.JdbcCartDao;
import com.StockPulse.StockPulse.models.CartDTO;

import com.StockPulse.StockPulse.models.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

@Service
public class CartService {

    @Autowired
    private JdbcCartDao jdbcCartDao;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Stock> addStockToCart(int stockId, int cartId) {
        jdbcCartDao.addStockToCart(stockId, cartId); // Add stock to cart in the database

        // Now you can fetch the updated list of stocks for the cart from the database
        String sql = "SELECT * FROM cart_stock WHERE cart_id = ?";
        List<Stock> updatedStockList = jdbcTemplate.query(sql, new Object[]{cartId}, (rs, rowNum) ->
                // new Stock(rs.getInt("stock_id"), rs.getString("name"), rs.getDouble("price")));
                new Stock(rs.getLong("stock_id"), rs.getInt("quantity"), rs.getDouble("cost"),rs.getString("name"), rs.getString("owner")));

        return updatedStockList;
    }

    public List<Stock> removeStockFromCart(int stockId, int cartId) {
        jdbcCartDao.removeStockFromCart(stockId, cartId); // Remove stock from cart in the database

        // Now you can fetch the updated list of stocks for the cart from the database
        String sql = "SELECT * FROM cart_stock WHERE cart_id = ?";
        List<Stock> updatedStockList = jdbcTemplate.query(sql, new Object[]{cartId}, (rs, rowNum) ->
                // new Stock(rs.getInt("stock_id"), rs.getString("name"), rs.getDouble("price")));
                new Stock(rs.getLong("stock_id"), rs.getInt("quantity"), rs.getDouble("cost"),rs.getString("name"), rs.getString("owner")));

        return updatedStockList;
    }
}
