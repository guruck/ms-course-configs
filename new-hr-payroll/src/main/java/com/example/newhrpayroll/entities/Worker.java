package com.example.newhrpayroll.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double dailyIncome;
	
}
