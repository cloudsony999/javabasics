package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/amit")
	public String test() {
		return "<body bgcolor='yellow' text='green'><h1>I am Spring Boot</h1></body>";
	}

}
