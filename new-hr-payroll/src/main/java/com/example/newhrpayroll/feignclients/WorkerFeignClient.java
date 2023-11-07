package com.example.newhrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.newhrpayroll.entities.Worker;

//o parametro url foi passado a nivel de criacao hardCode para teste com o endpoint associado
@Component
//@FeignClient(name = "new-hr-worker", url="localhost:8001", path = "/workers")
@FeignClient(name = "new-hr-worker", path = "/workers")
public interface WorkerFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);
}
