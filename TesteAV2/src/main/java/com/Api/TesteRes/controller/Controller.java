package com.Api.TesteRes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Api.TesteRes.service.HelloService;

@RestController
public class Controller {
    @Autowired
    private HelloService helloService;
    @GetMapping("/test")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return helloService.getHello(name);
    }
}