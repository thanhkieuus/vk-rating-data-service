package com.vk.movierating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VkRatingDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VkRatingDataServiceApplication.class, args);
	}

}
