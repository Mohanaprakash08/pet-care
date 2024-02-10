package com.example.petcare.entity;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Entity
public class Service {
	
	private int serviceId;
	private boolean bath;
	private boolean haircut;
	private boolean nailcut;
	private boolean brush;
	private boolean daycare;
	
}
