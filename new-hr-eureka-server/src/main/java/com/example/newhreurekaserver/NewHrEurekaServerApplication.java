package com.example.newhreurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NewHrEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewHrEurekaServerApplication.class, args);
	}

}
