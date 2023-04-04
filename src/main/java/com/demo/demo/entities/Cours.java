package com.demo.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cours {
	@Id
	int id_cours;
	String name_cours;
	
	@ManyToMany(mappedBy = "cours")
	private List<Student> student;
	
	
	
}
