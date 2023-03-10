package com.ty.mongodemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ty")
public class MongoDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDemoProjectApplication.class, args);
	}

}
