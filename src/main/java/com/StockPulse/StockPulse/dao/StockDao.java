package com.StockPulse.StockPulse.dao;

import com.StockPulse.StockPulse.models.Stock;
import java.util.List;

// Will contain the CRUD methods to implement in the JDBC Layer without exposing details of database interation
// interation and maniupulation
public interface StockDao {
    Stock findById(long id);

    List<Stock> findAll();

    // TODO - Create Stock
    void createStock();

    // TODO - Update info of Stock
    void updateStock(Stock stock);

    // TODO - Read/Get info of Stock
    Stock getStock();

    // TODO - Delete Stock
    void deleteStock(long stockId);
}
