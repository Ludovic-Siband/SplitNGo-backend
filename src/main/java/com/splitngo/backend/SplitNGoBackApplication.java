package com.splitngo.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SplitNGoBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplitNGoBackApplication.class, args);
	}

}
