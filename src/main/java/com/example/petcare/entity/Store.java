package com.example.petcare.entity;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Entity
public class Store {
	
	private boolean belt;
	private boolean food;
	private boolean bowls;
	private boolean chain;
	private boolean toys;
	private boolean medicine;
	
}
