package com.demo.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Assurance {
	@Id
	int assuranceNumber;
	String place;
	
	@OneToOne(mappedBy = "assurance")
	private Student student;
}
