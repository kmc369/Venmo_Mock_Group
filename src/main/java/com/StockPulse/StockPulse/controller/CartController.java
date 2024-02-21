package com.StockPulse.StockPulse.controller;

// hello - Luis
// hello test after conflict - luis
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.StockPulse.StockPulse.models.Stock;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "http://localhost:3000")
public class CartController {
    
    @Autowired
    private List<Stock> cartList;

    public CartController() {
        cartList = new ArrayList<Stock>();
    }

    @PostMapping("")
    public List<Stock> addStockToCart(int stock_id, int cart_id){
        
        //find the cart by the id
        //find the stock by the id

        //if they both exists, append Stock to cart list else return no stock 
        return cartList;
    }

 
    @DeleteMapping("/api/cart/stock/{id}")
    public List<Stock> deleteFromCart(int stock_id, int cart_id) {
        //find the cart by the id
        //find the stock by the id

        //remove it from the cart
        return cartList;
    }
}
