package com.StockPulse.StockPulse.controller;

import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.StockPulse.StockPulse.models.Stock;
import com.StockPulse.StockPulse.services.CartService;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "http://localhost:3000")
public class CartController {
    
    @Autowired
    private CartService cartService;

    @PostMapping("/{cartId}/addStock")
    public ResponseEntity<List<Stock>> addStockToCart(@PathVariable("cartId") int cartId,
                                                      @RequestParam("stockId") int stockId) {
        List<Stock> updatedStockList = cartService.addStockToCart(stockId, cartId);
        if (!updatedStockList.isEmpty()) {
            return ResponseEntity.ok(updatedStockList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    // @DeleteMapping("/api/cart/stock/{id}")
    // public List<Stock> deleteFromCart(int stock_id, int cart_id) {
    //     //find the cart by the id
    //     //find the stock by the id
    //     List<Stock> updatedStockList = new ArrayList<>();
    //     //remove it from the cart
    //     return updatedStockList;
    // }
}
