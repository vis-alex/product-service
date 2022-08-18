package com.alex.vis.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
//For updating bean in runtime, whenever you called this controller. Every time when we call controller it will
// read test.name
@RefreshScope
public class TestController {

    @Value("${test.name}")
    private String name;

    @GetMapping
    public String test() {
        return name;
    }
}
