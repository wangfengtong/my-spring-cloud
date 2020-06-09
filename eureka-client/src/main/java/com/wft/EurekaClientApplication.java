package com.wft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(EurekaClientApplication.class, args);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
