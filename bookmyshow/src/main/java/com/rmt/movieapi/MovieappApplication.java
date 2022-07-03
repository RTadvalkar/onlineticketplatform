package com.rmt.movieapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rmt.movieapi")
public class MovieappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieappApplication.class, args);
	}

}
