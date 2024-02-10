package com.example.petcare.dto;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Component
public class Admindto {

	private int aId;
	private String aName;
	private long aContact;
	
}
