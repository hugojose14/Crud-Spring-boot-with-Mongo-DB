package com.bolsaideas.springboot.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class ApiHugoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiHugoApplication.class, args);
	}

}
