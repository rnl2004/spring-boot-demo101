package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan(basePackages = "com.example")
public class SpringbootDemo101Application {

	//NOTE: The SpringbootDemo101Application main class should reside at package root eg. com.example
	//      so that the request mappings will be registered and accessible.
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo101Application.class, args);
	}

}
