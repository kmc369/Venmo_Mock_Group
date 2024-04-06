package com.StockPulse.StockPulse.dao;


import com.StockPulse.StockPulse.models.Stock;

public interface CartDao {


    void addStockToCart(int stockId, int cartId);

    void removeStockFromCart(int stockId, int cartId);


    
}