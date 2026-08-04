package com.reliance.relcrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reliance.relcrm.entity.Student;

@Repository
public interface MyRepository extends JpaRepository<Student, Integer>{
	
	

}
