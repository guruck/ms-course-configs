package com.example.newhrconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class NewHrConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewHrConfigServerApplication.class, args);
	}

}
