package com.syam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class P42SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(P42SwaggerApplication.class, args);
	}

}
