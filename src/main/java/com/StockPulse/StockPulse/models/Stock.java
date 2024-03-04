package com.StockPulse.StockPulse.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Stock {
    private long stock_id;
    private int quantity;
    private double cost;
    private String symbol;
    private String owner;
    private long card_id;
}