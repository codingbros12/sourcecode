package com.example.springsecurity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringsecurityApplication {

	public static void main(String[] args) {
		List<String>list1 = new ArrayList<>();
		SpringApplication.run(SpringsecurityApplication.class, args);
	}

}
