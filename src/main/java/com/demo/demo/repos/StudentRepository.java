package com.demo.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.demo.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	

}
