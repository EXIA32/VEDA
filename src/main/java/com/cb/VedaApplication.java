package com.cb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class VedaApplication {

	@RequestMapping(value = "/")
	public String index(){
		return "Hello World By Spring Boot.";
	}

	public static void main(String[] args) {
		SpringApplication.run(VedaApplication.class, args);
	}
}
