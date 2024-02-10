package com.StockPulse.StockPulse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.StockPulse.StockPulse.models.Stock;

public class StockController {
    // This class will be updated later.

    @Autowired
    private Stock stock;

    @PostMapping("")
    public void updateQuantity(int newQuantity) {
        // This method will be implemented later.
    }

    @GetMapping("")
    public void getCost() {
        // This method will be implemented later.
    }

    @GetMapping("")
    public void getOwner() {
        // This method will be implemented later.
    }
}
