package com.example.petcare.entity;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Data
@Entity

public class Admin {

	private int aId;
	private String aName;
	private long aContact;
	private String aEmail;
    private String aPassword;
    
}
