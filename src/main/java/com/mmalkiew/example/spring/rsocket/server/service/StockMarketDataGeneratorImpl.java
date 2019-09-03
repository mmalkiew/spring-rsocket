package com.mmalkiew.example.spring.rsocket.server.service;

import com.mmalkiew.example.spring.rsocket.model.StockMarketData;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;
import java.util.stream.Stream;

@Component
public class StockMarketDataGeneratorImpl implements StockMarketDataGenerator {

    private static final int BOUND = 100;

    private Random random = new Random();

    @Override
    public Flux<StockMarketData> getAll(String stock) {
        return Flux.fromStream(Stream.generate(() -> createStockMarketData(stock)))
                   .log()
                   .delayElements(Duration.ofSeconds(1));
    }

    private StockMarketData createStockMarketData(String stock) {
        return new StockMarketData(stock, random.nextInt(BOUND));
    }
}
