package com.StockPulse.StockPulse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.StockPulse.StockPulse.models.Stock;

public class StockController {
    // This class is used to make updates to a stock object

    @Autowired
    private Stock stock;

    @PostMapping("")
    public void updateQuantity(int newQuantity) {
        // This method will be implemented later.
    }

    @PostMapping("")
    public void getCost() {
        // This method will be implemented later.
    }

    @PostMapping("")
    public void getOwner() {
        // This method will be implemented later.
    }
}
