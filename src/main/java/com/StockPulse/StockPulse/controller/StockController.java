package com.StockPulse.StockPulse.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.StockPulse.StockPulse.models.Stock;
import com.StockPulse.StockPulse.services.StockService;

@RestController
@RequestMapping("/api/stocks")
@CrossOrigin(origins = "http://localhost:3000")
public class StockController {
    // This class will be updated later.

    @Autowired
    private StockService stockService;

    @GetMapping("/")
    public List<Stock> getAllStock() {
        return stockService.getAllStock();
    }

    @PostMapping("")
    public void updateQuantity(int newQuantity) {
        // This method will be implemented later.
    }


    @GetMapping("/cost")
    public void getCost() {
        // This method will be implemented later.
    }

   

    @GetMapping("")
    public void getOwner() {
        // This method will be implemented later.
    }
}
