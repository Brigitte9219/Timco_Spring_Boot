package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		// Configura la zona horaria de la JVM a "America/Bogota"
		TimeZone.setDefault(TimeZone.getTimeZone("America/Bogota"));

		SpringApplication.run(DemoApplication.class, args);
	}

}
