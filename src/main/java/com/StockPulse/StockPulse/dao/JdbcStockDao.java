package com.StockPulse.StockPulse.dao;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.StockPulse.StockPulse.models.Stock;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
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







/*
   Implements the CRUD operations from the StockDao interface and will pass
   objects to the StockService or some other class (to be implemented later) 
   to encapsulate it then pass it to the controller.
*/



    @Override
    public void createStock(Stock stock) {
        // TODO - Create Stock logic implementation
    }

    @Override
    public void updateIdOfStock(Stock stock) {
        // TODO - Update ID of Stock logic implementation
    }

    @Override
    public void updateQuantityOfStock(Stock stock) {
        // TODO - Update Quantity of Stock logic implementation
    }

    @Override
    public void updatePriceOfStock(Stock stock) {
        // TODO - Update Price of Stock logic implementation
    }

    @Override
    public void updateOwnerOfStock(Stock stock) {
        // TODO - Update Owner of Stock logic implementation
    }

    @Override
    public Stock getStock(Stock stock) {
        // TODO - Read/Get Info of Stock logic implementation
        return null;
    }

    @Override
    public void deleteStock(Long stockId) {
        // TODO - Delete Stock logic implementation
    }
}

