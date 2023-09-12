package com.heath.Patientsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PatientsApiApplication {
	@GetMapping("/Hello")
	public static String main(String[] args) {
		SpringApplication.run(PatientsApiApplication.class, args);

		return "Hello world";
	}

}
