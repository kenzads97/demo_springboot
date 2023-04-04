package com.demo.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.demo.demo.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours,Integer> {

}
