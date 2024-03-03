package com.StockPulse.StockPulse.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Cart {

    private Long card_id;
    private Long user_id;
}
