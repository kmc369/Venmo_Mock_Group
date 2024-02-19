package com.StockPulse.StockPulse.services;

import com.StockPulse.StockPulse.dao.JdbcStockDao;
import com.StockPulse.StockPulse.models.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StockService {
    /*
    This Class is responsible to return the Response Entity to the controller
    which will contain the Stock Object Plus the Response Code all in one
    */

    @Autowired
    private JdbcStockDao dao;

    // Accepts the Information required to create Stock TODO
    public ResponseEntity<Stock> returnsResponseForCreatingStockEntity(){

        return ResponseEntity.ok(new Stock());
    }
}
