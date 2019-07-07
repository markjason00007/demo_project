package com.springapplication.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Did it ran - 1");
		
		
		try {
		Thread.sleep(100000);
		}catch(Exception e) {e.printStackTrace();}
	}

}
