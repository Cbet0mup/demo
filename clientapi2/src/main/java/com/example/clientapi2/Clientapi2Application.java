package com.example.clientapi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Clientapi2Application {

    public static void main(String[] args) {
        SpringApplication.run(Clientapi2Application.class, args);
    }

}
