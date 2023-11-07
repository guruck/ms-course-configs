package com.example.newhrpayroll.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NonNull;

@Data
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	@NonNull
	private String name;
	@NonNull
	private Double dailyIncome;
	@NonNull
	private Integer days;
	
	public double getTotal() {
		return days * dailyIncome;
	}
}
