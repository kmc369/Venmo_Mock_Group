package com.StockPulse.StockPulse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.StockPulse.StockPulse.services.StockService;
import com.StockPulse.StockPulse.models.Stock;

public class StockController {
    // This class will be updated later.

    /* @Autowired
    private Stock stock; */

    @Autowired
    private StockService stockService;

    @PostMapping("/create_stock")
    public ResponseEntity<Stock> createStock() {
        return stockService.returnsResponseForCreatingStockEntity();
    }

    @PostMapping("/update_quantity")
    public void updateQuantity(int newQuantity) {
        // This method will be implemented later.
    }

    @PostMapping("/update_owner")
    public void updateOwner(String newOwner) {
        // This method will be implemented later.
    }

    @PostMapping("/update_cost")
    public void updateCost(double newCost) {
        // This method will be implemented later.
    }

    @PostMapping("/update_id")
    public void updateId(Long new_id) {
        // This method will be implemented later.
    }

    @GetMapping("/get_cost")
    public double getCost() {
        // This method will be implemented later.
        return 0.0;
    }

    @GetMapping("/get_cost")
    public String getOwner() {
        // This method will be implemented later.
        return null;
    }

    @GetMapping("/get_quantity")
    public int getQuantity() {
        // This method will be implemented later.
        return 0;
    }

    @GetMapping("/get_id")
    public long getId() {
        // This method will be implemented later.
        return 0;
    }
}
