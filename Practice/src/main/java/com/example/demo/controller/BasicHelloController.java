package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // REST API を作成するアノテーション
@RequestMapping("/hello")  // URLのパスを指定
public class BasicHelloController {

	@GetMapping  // HTTP GETリクエストを処理
	public String sayHello() {
		return "Hello, World!";
	}
}
