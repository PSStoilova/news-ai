package com.newsai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class NewsAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsAiApplication.class, args);
	}

}
