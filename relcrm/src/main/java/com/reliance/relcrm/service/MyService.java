package com.reliance.relcrm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.reliance.relcrm.entity.Student;
import com.reliance.relcrm.repository.MyRepository;

@Service
public class MyService {
	MyRepository myRepository;
	
	public MyService(MyRepository myRepository) {
		super();
		this.myRepository = myRepository;
	}
	
	public Student saveStudent(Student student) {
		return myRepository.save(student);
	}
	
	public List<Student> getAllStudents() {
		List<Student> stulist = myRepository.findAll();
		return stulist;
	}
	
	public void deleteStudent(int id) {
		Student student =  myRepository.getReferenceById(id);
		myRepository.delete(student);
		
	}
	public void updateStudent(Student student) {
		int id = student.getId();
		Student studentx = myRepository.getReferenceById(id);
		studentx.setName(student.getName());
		studentx.setCourse(student.getCourse());
		myRepository.save(studentx);
	}

}
