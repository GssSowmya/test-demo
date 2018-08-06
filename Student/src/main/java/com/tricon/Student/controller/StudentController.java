package com.tricon.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.Student.model.Student;
import com.tricon.Student.service.IStudentService;

@RestController
public class StudentController {

	@Autowired
	private IStudentService  student;
	
	@RequestMapping("/user")
	public List<Student> getAllUsers() {
		System.out.println("Inside: Controller");
		return student.getAllUsers();
	}
	
	@RequestMapping("/user/{id}")
	public List<Student> getUser(@PathVariable int id) {
		System.out.println("Inside: Controller");
		return student.getAllUsers();
	}
}
