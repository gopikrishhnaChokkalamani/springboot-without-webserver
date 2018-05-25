package com.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootWithoutWebServerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootWithoutWebServerApplication.class, args)
		
		//this will disable web server for springboot app by code
		new SpringApplicationBuilder(SpringbootWithoutWebServerApplication.class).web(false).run(args);
		
		//or
		
		//just add spring.main.web-environment=false to your yml or properties to disable from configurations
	}
}
