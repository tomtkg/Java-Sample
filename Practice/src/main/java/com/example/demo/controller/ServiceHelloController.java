package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello3")  // `/hello3` にアクセスしたらこのクラスが処理
public class ServiceHelloController {

    private final HelloService helloService;

    // コンストラクタで HelloService を注入（依存性注入）
    public ServiceHelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String sayHello(@RequestParam(defaultValue = "World") String name) {
        return helloService.getGreeting(name);
    }
}
