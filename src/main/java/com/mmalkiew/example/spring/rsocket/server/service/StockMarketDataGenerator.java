package com.mmalkiew.example.spring.rsocket.server.service;

import com.mmalkiew.example.spring.rsocket.model.StockMarketData;
import reactor.core.publisher.Flux;

public interface StockMarketDataGenerator {

    Flux<StockMarketData> getAll(String stock);
}
