package com.reliance.relcrm.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reliance.relcrm.entity.Student;
import com.reliance.relcrm.service.MyService;

//http://localhost:8080/api/add
//http://localhost:8080/api/getall
//http://localhost:8080/api/del?id=2
//http://localhost:8080/api/putstudent

@RestController
@RequestMapping("/api")
public class MyController{
	MyService myService;

	public MyController(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@PostMapping("/add")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println("ID     : " + student.getId());
	    System.out.println("NAME   : " + student.getName());
	    System.out.println("COURSE : " + student.getCourse());
	    return myService.saveStudent(student);
	}
	@GetMapping("getall")
	public List<Student> getAllStudent(){
		List<Student> list = myService.getAllStudents();
		return list;
	}
	@DeleteMapping("/del")
	public void delStudent(@RequestParam int id) {
		myService.deleteStudent(id);
	}
	@PutMapping("/putstudent")
	public void updateStudent(@RequestBody Student student){
		myService.updateStudent(student);
	}
	

	
}