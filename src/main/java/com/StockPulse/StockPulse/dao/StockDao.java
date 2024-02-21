package com.StockPulse.StockPulse.dao;

import com.StockPulse.StockPulse.models.Stock;

// Will contain the CRUD methods to implement in the JDBC Layer
public interface StockDao {
    // TODO - Create Stock
    void createStock();

    // TODO - Update info of Stock
    void updateIdOfStock(Stock stock);
    void updateQuantityOfStock(Stock stock);
    void updatePriceOfStock(Stock stock);
    void updateSymbolOfStock(Stock stock);
    void updateOwnerOfStock(Stock stock);

    // TODO - Read/Get info of Stock
    Stock getStock();

    // TODO - Delete Stock
    void deleteStock(long stockId);
}
