package com.StockPulse.StockPulse.dao;

import com.StockPulse.StockPulse.models.Stock;
import com.StockPulse.StockPulse.controller.StockController;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import java.util.List;


/*
   Implements the CRUD operations from the StockDao interface and will pass
   objects to the StockService or some other class (to be implemented later) 
   to encapsulate it then pass it to the controller.
*/

@AllArgsConstructor
@Component
public class JdbcStockDao implements StockDao {
    
    //find user by identifier
    private static final String SQL_FIND_BY_ID = "SELECT * FROM stocks WHERE id = ?";
    //find all users
    private static final String SQL_FIND_ALL = "SELECT * FROM stocks";
    //insert new user to database
    private static final String SQL_INSERT = "INSERT INTO stocks (stock_id, quantity, cost, symbol, owner, card_id) VALUES (?, ?, ?, ?, ?)";
    //update an existing user to database
    private static final String SQL_UPDATE = "UPDATE stocks SET stock_id = ?, quantity = ?, cost = ?, symbol = ?, owner = ?, card_id = ? WHERE id = ?";
    //delete user by identifer
    private static final String SQL_DELETE_BY_ID = "DELETE FROM stocks WHERE id = ?";

    //JDBC Connectivity Object
    private JdbcTemplate jdbcTemplate;

    //StockController Object
    private StockController stockController;

    @Override
    public Stock findById(long id) {
        return null;
    }

    @Override
    public List<Stock> findAll() {
        return null;
    }

    @Override
    public void createStock() {
        // TODO - Create Stock logic implementation
        stockController.createStock();
        var sql = SQL_INSERT;
        try {
            jdbcTemplate.update(sql, stockController);
        } catch (Exception e) {
            System.out.println("Error in Creating Stock");
        }
    }

    @Override
    public void updateStock(Stock stock) {
        // TODO - Update Stock logic implementation
        var sql = SQL_UPDATE;
        try {
            jdbcTemplate.update(sql, stock);
        } catch (Exception e) {
            System.out.println("Error in Updating Stock");
        }
    }

    @Override
    public Stock getStock() {
        // TODO - Read/Get Info of Stock logic implementation
        var sql = "SELECT stock_id, quantity, cost, symbol, owner, card_id FROM stocks WHERE stock_id = ?;";
        Stock stock = null;
        try{
            SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
            if (result.next()){
                stock = mapToStock(result);
            }
        } catch (Exception e){
            System.out.println("Error in Stock Query");
        }
        return stock;
    }

    @Override
    public void deleteStock(long stockId) {
        var sql = SQL_DELETE_BY_ID;
        try {
            jdbcTemplate.update(sql, stockId);
        } catch (Exception e) {
            System.out.println("Error in Deleting Stock");
        }
    }

    private Stock mapToStock(SqlRowSet rs){
        return new Stock(
                rs.getLong("stock_id"),
                rs.getInt("quantity"),
                rs.getDouble("cost"),
                rs.getString("symbol"),
                rs.getString("owner"),
                rs.getLong("card_id")
        );
    }
}