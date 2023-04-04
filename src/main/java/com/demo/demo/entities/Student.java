package com.demo.demo.entities;


import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	int age;
	
	@ManyToOne
	@JoinColumn(name ="university_id")
	private University university;

	@ManyToMany(cascade =CascadeType.ALL)
	@JoinTable(name="student_cours",
	joinColumns=@JoinColumn(name= "id_student"),
	inverseJoinColumns = @JoinColumn(name ="id_cours")
	)
	private List<Cours> cours;
	
	
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name ="id_assurance", referencedColumnName = "assuranceNumber")
	private Assurance assurance;


	



	


	

}
