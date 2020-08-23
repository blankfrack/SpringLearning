package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		// Eight Feature Branch

	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	
	@GetMapping("/home")
	public String home() {
		return "There's no place like Home.";
	}
	
	@GetMapping("/add")
	public String add(@RequestParam(value = "firstNumber", defaultValue = "0") int firstNumber, @RequestParam(value = "secondNumber", defaultValue = "0") int secondNumber) {
		return String.format("Adding %d to %d equals %d!", firstNumber, secondNumber, (firstNumber+secondNumber));
	}

}
