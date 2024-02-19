package com.StockPulse.StockPulse.dao;

import com.StockPulse.StockPulse.models.LoginUserDTO;
import com.StockPulse.StockPulse.models.RegisterUserDTO;
import com.StockPulse.StockPulse.models.Stock;

public interface CartDao {


    // TODO - add stock
    void addStockToCart(RegisterUserDTO dto);


    // TODO - deleteStock
    void deleteStockFromCart(User user);


    
}