package com.StockPulse.StockPulse.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Cart {
    private List<Stock> stockList;
    private Long card_id;
    private Long user_id;
}
