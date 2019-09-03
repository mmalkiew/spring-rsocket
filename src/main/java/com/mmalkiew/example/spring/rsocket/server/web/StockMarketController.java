package com.mmalkiew.example.spring.rsocket.server.web;

import com.mmalkiew.example.spring.rsocket.model.StockMarketData;
import com.mmalkiew.example.spring.rsocket.request.StockMarketDataRequest;
import com.mmalkiew.example.spring.rsocket.server.service.StockMarketDataGenerator;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@Controller
public class StockMarketController {

    private final StockMarketDataGenerator generator;

    public StockMarketController(StockMarketDataGenerator generator) {
        this.generator = generator;
    }

    @MessageMapping("feedMarketData")
    public Flux<StockMarketData> feedMarketData(StockMarketDataRequest request) {
        return generator.getAll(request.getStock());
    }
}
