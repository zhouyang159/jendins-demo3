package com.example.jendinsdemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JendinsDemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(JendinsDemo3Application.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello DK";
	}

}
