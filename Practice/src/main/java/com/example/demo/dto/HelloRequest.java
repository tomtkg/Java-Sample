package com.example.demo.dto;

public class HelloRequest {

	private int count;
	private String prefix;

	public HelloRequest() {
	}

	public HelloRequest(int count, String prefix) {
		this.count = count;
		this.prefix = prefix;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
}
