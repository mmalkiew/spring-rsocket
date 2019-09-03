package com.mmalkiew.example.spring.rsocket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockMarketData {

    private String stock;
    private int currentPrice;
}
