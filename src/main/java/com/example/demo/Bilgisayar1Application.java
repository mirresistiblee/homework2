package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Bilgisayar1Application {

	public static void main(String[] args) {
		SpringApplication.run(Bilgisayar1Application.class, args);
		List<String> greetings = new ArrayList<>();
		for (int i = 0; i <= 15; i++) {
			greetings.add("nep "+i);
		}

		for (int i = 0; i < greetings.size(); i++) {
			System.out.println(greetings.get(i));
		}

//		SpringApplication.run(Bilgisayar1Application.class, args);
	}

}
