package com.staeroexample.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.staeroexample")
public class StAeroSpaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(StAeroSpaTestApplication.class, args);
	}

}
