package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;


@SpringBootApplication
public class CrudUnicomerV2Application {

	public static void main(String[] args) {
		//BasicConfigurator.configure(args);
		SpringApplication.run(CrudUnicomerV2Application.class, args);
	}

}
