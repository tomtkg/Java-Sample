package com.example.demo.api;

import com.example.demo.dto.HelloRequest;
import com.example.demo.dto.HelloResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/json-request")
public class JsonRequestController {

	@PostMapping
	public List<HelloResponse> sayHello(@RequestBody HelloRequest request) {
		return IntStream.rangeClosed(1, request.getCount())
				.mapToObj(i -> new HelloResponse("Hello, " + request.getPrefix() + i + "!"))
				.toList();  // Java 16+
	}
}
