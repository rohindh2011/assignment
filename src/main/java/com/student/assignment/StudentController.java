package com.student.assignment;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class StudentController {
	@RequestMapping("hello")
	public String hello() {
		return "hello world";
	}
	
	@Autowired
	private StudentService studentService;

	@RequestMapping("/students")
	public List<Student> getStudents() {
		return studentService.getStudents();
		

	}
	
	@RequestMapping(method=RequestMethod.POST, value="/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping("/students/{name}")
	public Optional<Student> getStudent(@PathVariable String name){
		System.out.println("Inside getStudent");
		return studentService.getStudent(name);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/students/{name}")
	public void updateStudent(@RequestBody Student student, @PathVariable String name) {
		System.out.println("inside updateStudent");
		studentService.updateStudent(name, student);
	}


	@RequestMapping(method=RequestMethod.DELETE, value="/students/{name}")
	public void deleteStudent(@PathVariable String name){
		System.out.println("Inside deleteStudent");
		studentService.deleteStudent(name);
	}

}
