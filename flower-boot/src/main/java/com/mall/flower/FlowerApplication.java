package com.mall.flower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FlowerApplication {

    @RequestMapping("/login")
    public String login() {
        return "Hello Spring-Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(FlowerApplication.class, args);
    }

}
