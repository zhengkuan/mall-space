package com.mall.flower;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 测试spring-boot.
 * Created by Administrator on 2019/5/7
 */
@RestController
@RequestMapping(value = "/test")
public class LoginController {

    @RequestMapping(value = "/login")
    public String login() {
        return "Hello Spring Boot!";
    }
}
