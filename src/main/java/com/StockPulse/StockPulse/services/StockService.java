package com.StockPulse.StockPulse.services;

import com.StockPulse.StockPulse.dao.StockDao;
import com.StockPulse.StockPulse.models.CartDTO;

import com.StockPulse.StockPulse.models.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;


@Service
public class StockService{


    @Autowired
    private StockDao stockDao;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Stock> getAllStock(){
        return stockDao.getAllStocks();
    }




}