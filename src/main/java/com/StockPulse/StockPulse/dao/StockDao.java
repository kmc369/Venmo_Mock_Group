package com.StockPulse.StockPulse.dao;

import com.StockPulse.StockPulse.models.Stock;

import java.util.List;


public interface StockDao {
    List<Stock> getAllStocks();
}
