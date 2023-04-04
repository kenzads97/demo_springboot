package com.demo.demo.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.entities.Cours;
import com.demo.demo.entities.Student;
import com.demo.demo.services.HelloService;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class HelloController {

	@Autowired
	HelloService s;

	@GetMapping("/")
	public List<Student> getallStudent() {
		return s.getStudent();
	}

	@GetMapping("/{id}")
	public Optional<Student> getoneStudent(@PathVariable int id) {
		return s.onegetStudent(id);
	}

	@PostMapping("/")
	public Student addStudent(@RequestBody Student nvStudent) {
		return s.ajoutStudent(nvStudent);
	}

	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable int id) {
		s.suppStudent(id);
	}

	@PutMapping("/{id}")
	public Student updateStudent(@RequestBody Student Student) {
		return s.putStudent(Student);
	}

	@PostMapping("/cours/")
	public Cours addCours(@RequestBody Cours newCOURS) {
		return s.ajoutCours(newCOURS);
	}

	@GetMapping("/cours/")

	public List<Cours> getallCours() {
		return s.getCours();
	}

	@PutMapping("/add-cours")
	public Optional<Student> studentCours(@RequestBody Map<String, Integer> map)
	{
			return s.student_Cours(map.get("studentId"), map.get("coursId"));
		} 

	
}
