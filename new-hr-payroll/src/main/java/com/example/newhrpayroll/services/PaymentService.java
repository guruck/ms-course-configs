package com.example.newhrpayroll.services;

//import java.util.HashMap; //usado na fase1
//import java.util.Map; //usado na fase1

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value; //usado na fase1
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate; //usado na fase1

import com.example.newhrpayroll.entities.Payment;
import com.example.newhrpayroll.entities.Worker;
import com.example.newhrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
//	chamada via REST hardCode para teste
//	@Value("${new-hr-worker.host}")
//	private String workerHost;
//	
//	@Autowired
//	private RestTemplate restTemplate;

//	chamada utilizando Spring cloud
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(long workerId, int days) {
//		mockado
//		return new Payment("Bob", 200.0, days);
		
//		via REST hardCode para teste
//		Map<String, String> uriVariables = new HashMap<>();
//		uriVariables.put("id", String.valueOf(workerId));
//		Worker worker = restTemplate.getForObject(workerHost.concat("/workers/{id}"), Worker.class, uriVariables);
//		return new Payment(worker.getName(), worker.getDailyIncome(), days);
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
