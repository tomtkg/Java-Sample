package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")  // `/hello2` にアクセスしたらこのクラスが処理
public class SimpleHelloController {

	@GetMapping
	public String sayHello(@RequestParam(defaultValue = "World") String name) {
		return "Hello, " + name + "!";
	}
}
