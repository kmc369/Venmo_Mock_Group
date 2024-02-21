package com.StockPulse.StockPulse.dao;

import com.StockPulse.StockPulse.models.Stock;
import com.StockPulse.StockPulse.controller.StockController;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;


/*
   Implements the CRUD operations from the StockDao interface and will pass
   objects to the StockService or some other class (to be implemented later) 
   to encapsulate it then pass it to the controller.
*/

@AllArgsConstructor
@Component
public class JdbcStockDao implements StockDao {
    
    //JDBC Connectivity Object
    private JdbcTemplate jdbcTemplate;

    //StockController Object
    private StockController stockController;

    @Override
    public void createStock() {
        // TODO - Create Stock logic implementation
        stockController.createStock();
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
    public void updateSymbolOfStock(Stock stock) {
        // TODO - Update Symbol of Stock logic implementation
    }

    @Override
    public Stock getStock() {
        // TODO - Read/Get Info of Stock logic implementation
        var sql = "SELECT stock_id, quantity, cost, symbol, owner FROM stocks WHERE stock_id = ?;";
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
        // TODO - Delete Stock logic implementation
    }

    private Stock mapToStock(SqlRowSet rs){
        return new Stock(
                rs.getLong("stock_id"),
                rs.getInt("quantity"),
                rs.getDouble("cost"),
                rs.getString("symbol"),
                rs.getString("owner")
        );
    }
}
