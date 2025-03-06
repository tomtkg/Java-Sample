package com.example.demo.api;

import com.example.demo.dto.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/json-custom")
public class JsonCustomController {

	@GetMapping
	public List<HelloResponse> sayHello(
			@RequestParam(defaultValue = "3") int count,
			@RequestParam(defaultValue = "User") String prefix) {

		return IntStream.rangeClosed(1, count)
				.mapToObj(i -> new HelloResponse("Hello, " + prefix + i + "!"))
				.toList();  // Java 16+
	}
}
