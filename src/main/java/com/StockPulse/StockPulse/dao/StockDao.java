package com.StockPulse.StockPulse.dao;

import com.StockPulse.StockPulse.models.Stock;


import java.util.List;


public interface StockDao {
    List<Stock> getAllStocks();


    void createStock(Stock stock);


    void updateIdOfStock(Stock stock);
    void updateQuantityOfStock(Stock stock);
    void updatePriceOfStock(Stock stock);
    void updateOwnerOfStock(Stock stock);

    Stock getStock(Stock stock);

    void deleteStock(Long stockId);

}
