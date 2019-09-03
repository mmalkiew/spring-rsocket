package com.mmalkiew.example.spring.rsocket.client.web;

import com.mmalkiew.example.spring.rsocket.model.StockMarketData;
import com.mmalkiew.example.spring.rsocket.request.StockMarketDataRequest;
import org.reactivestreams.Publisher;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockMarketClientController {

    private final RSocketRequester rSocketRequester;

    public StockMarketClientController(RSocketRequester rSocketRequester) {
        this.rSocketRequester = rSocketRequester;
    }

    @GetMapping(value = "/feed/{stock}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Publisher<StockMarketData> feed(@PathVariable("stock") String stock) {
        return rSocketRequester.route("feedMarketData")
                               .data(new StockMarketDataRequest(stock))
                               .retrieveFlux(StockMarketData.class);
    }
}
