package com.restclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com", "com.restclock", "com.model", "com.controller", "com.service",
		"com.customexception" })
public class BerlinClockApplication {

	public static void main(String[] args) {
		SpringApplication.run(BerlinClockApplication.class, args);
	}
}
