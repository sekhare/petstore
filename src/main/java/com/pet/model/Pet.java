package com.pet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;




import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity(name="pet")
public class Pet {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String petName;
	private String status;
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
