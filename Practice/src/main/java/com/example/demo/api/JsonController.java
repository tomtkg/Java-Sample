package com.example.demo.api;

import com.example.demo.dto.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class JsonController {

	@GetMapping
	public HelloResponse sayHello(@RequestParam(defaultValue = "World") String name) {
		return new HelloResponse("Hello, " + name + "!");
	}
}
