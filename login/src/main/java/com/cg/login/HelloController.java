package com.cg.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("hello1")
	public String hello1() {
		System.out.println("from hello1");
		return "I am from hello1";
	}
	

	@GetMapping("hello2")
	public String hello2() {
		System.out.println("from hello2");
		return "I am from hello2";
	}
	
}
