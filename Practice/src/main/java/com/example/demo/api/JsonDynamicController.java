package com.example.demo.api;

import com.example.demo.dto.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/json-dynamic")
public class JsonDynamicController {

	@GetMapping
	public List<HelloResponse> sayHello(
			@RequestParam(defaultValue = "3") int count) {
//		List<HelloResponse> messages = new ArrayList<>();
//		for (int i = 1; i <= count; i++) {
//			messages.add(new HelloResponse("Hello, User" + i + "!"));
//		}
//		return messages;
		return IntStream.rangeClosed(1, count)
				.mapToObj(i -> new HelloResponse("Hello, User" + i + "!"))
				.toList();  // Java 16 以上
	}
}
