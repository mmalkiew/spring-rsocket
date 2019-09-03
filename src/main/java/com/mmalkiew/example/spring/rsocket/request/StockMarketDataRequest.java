package com.mmalkiew.example.spring.rsocket.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockMarketDataRequest {

    private String stock;
}
