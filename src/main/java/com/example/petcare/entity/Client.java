package com.example.petcare.entity;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
public class Client {

	private int cID;
	private String cName;
	private String cContact;
	private String cAddress;
	
}
