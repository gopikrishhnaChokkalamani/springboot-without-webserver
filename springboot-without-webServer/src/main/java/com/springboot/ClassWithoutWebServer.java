package com.springboot;

import org.springframework.boot.CommandLineRunner;

public class ClassWithoutWebServer implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		// add all you logic here, this will be your starting point
		// if you have multiple classes implementing commandlinerunner
		// you can use @Order(1) on top of the classes to define the order you want the
		// execution to happen
	}

}
