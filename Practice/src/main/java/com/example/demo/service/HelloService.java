package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service  // サービスクラスを表すアノテーション
public class HelloService {

	public String getGreeting(String name) {
		return "Hello, " + name + "!";
	}
}
