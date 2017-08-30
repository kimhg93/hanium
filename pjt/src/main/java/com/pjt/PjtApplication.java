package com.pjt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class PjtApplication {

	public static void main(String[] args) {
		SpringApplication.run(PjtApplication.class, args);
	}
}
