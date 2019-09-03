package com.mmalkiew.example.spring.rsocket.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringRSocketServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder().main(SpringRSocketServerApplication.class)
                                      .sources(SpringRSocketServerApplication.class)
                                      .profiles("server")
                                      .run(args);
    }
}
