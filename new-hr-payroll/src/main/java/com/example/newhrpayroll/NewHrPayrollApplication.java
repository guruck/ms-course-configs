package com.example.newhrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient; //Eureka tem balanceador
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker; //DEPRECATED
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//import com.example.newhrpayroll.config.AppConfig; //para uso do balanceador sem Eureka


@EnableDiscoveryClient
//@LoadBalancerClient(name = "new-hr-worker", configuration = AppConfig.class) Eureka tem balanceador
@EnableFeignClients
@SpringBootApplication
public class NewHrPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewHrPayrollApplication.class, args);
	}

}
