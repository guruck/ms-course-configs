package com.example.newhrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient; DEPRECATED

@EnableDiscoveryClient
@SpringBootApplication
public class NewHrWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewHrWorkerApplication.class, args);
	}

}
