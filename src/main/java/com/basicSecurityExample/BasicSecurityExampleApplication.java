package com.basicSecurityExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//main 
@SpringBootApplication //(exclude = {SecurityAutoConfiguration.class})
public class BasicSecurityExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicSecurityExampleApplication.class, args);
		
	}

}
