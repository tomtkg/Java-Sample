package com.example.demo.api;

import com.example.demo.dto.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/json-list")
public class JsonListController {

	@GetMapping
	public List<HelloResponse> sayHello() {
		return List.of(
				new HelloResponse("Hello, Alice!"),
				new HelloResponse("Hello, Bob!"),
				new HelloResponse("Hello, Charlie!")
		);
	}
}
