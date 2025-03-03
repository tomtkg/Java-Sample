package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-json")
public class JsonHelloController {

	@GetMapping
	public HelloResponse sayHello(@RequestParam(defaultValue = "World") String name) {
		return new HelloResponse("Hello, " + name + "!");
	}
}
