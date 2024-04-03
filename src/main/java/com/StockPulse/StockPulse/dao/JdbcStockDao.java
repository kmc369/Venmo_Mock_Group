package com.StockPulse.StockPulse.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.StockPulse.StockPulse.models.Stock;

import java.util.List;

@Repository
public class JdbcStockDao implements StockDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcStockDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Stock> getAllStocks() {
        String sql = "SELECT * FROM stock";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Stock stock = new Stock();
            stock.setStock_id(rs.getLong("stock_id"));
            stock.setQuantity(rs.getInt("quantity"));
            stock.setCost(rs.getDouble("cost"));
            stock.setName(rs.getString("name"));
       
            return stock;
        });
    }
}

