package com.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CH1113EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CH1113EurekaApplication.class, args);
    }
}
