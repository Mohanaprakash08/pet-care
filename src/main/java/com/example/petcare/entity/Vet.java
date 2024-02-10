package com.example.petcare.entity;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Entity
public class Vet {

	private int docID;
	private String docName;
	private String docMail;
	
	
}
