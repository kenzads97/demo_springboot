package com.demo.demo.services;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.entities.Cours;
import com.demo.demo.entities.Student;
import com.demo.demo.repos.AssuranceRepository;
import com.demo.demo.repos.CoursRepository;
import com.demo.demo.repos.StudentRepository;

@Service
public class HelloService {
	@Autowired
	StudentRepository studentRepo;
	
	@Autowired
	AssuranceRepository assuranceRepo;
	
	@Autowired
	CoursRepository coursRepo;
	
	public List<Student> getStudent() {
		return studentRepo.findAll();
	}

	public Optional<Student> onegetStudent(Integer id) {
		return studentRepo.findById(id);
	}

	public Student ajoutStudent(Student nvStudent) {
		int age = nvStudent.getAge();
		if (age > 25) {
			nvStudent.setAge(25);
		} 
		
		return  studentRepo.save(nvStudent);

	}

	public void suppStudent(int id) {
		studentRepo.deleteById(id);
	}

	public Student putStudent(Student Student) {
		return studentRepo.save(Student);
	}
	
	public Cours ajoutCours(Cours cours) {
		return coursRepo.save(cours);
		
	}
	public List<Cours> getCours() {
		return coursRepo.findAll();
		
	}

	public Optional<Student> student_Cours(int studentId) {
	   return  studentRepo.findById(studentId);
	   		 
	}
}
