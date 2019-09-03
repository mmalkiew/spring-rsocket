package com.mmalkiew.example.spring.rsocket.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringRSocketClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder().main(SpringRSocketClientApplication.class)
                                      .sources(SpringRSocketClientApplication.class)
                                      .profiles("client")
                                      .run(args);
    }
}
