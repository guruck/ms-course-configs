package com.example.newhrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.newhrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
