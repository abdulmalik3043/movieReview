package com.review.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MovieReview1Application {

	public static void main(String[] args) {
		SpringApplication.run(MovieReview1Application.class, args);
	}

}

