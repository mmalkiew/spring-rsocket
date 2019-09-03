package com.mmalkiew.example.spring.rsocket.client;

import com.mmalkiew.example.spring.rsocket.server.SpringRSocketServerApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class SpringRSocketClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder().main(SpringRSocketServerApplication.class)
                                      .sources(SpringRSocketServerApplication.class)
                                      .profiles("client")
                                      .run(args);
    }
}
