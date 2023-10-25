package com.student.assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
	@Autowired
	private StudentDAORepository studentDAORepository;
	public List<Student> getStudents(){
		List<Student> studentList = new ArrayList<Student>();
		studentDAORepository.findAll().forEach(studentList::add);
		return studentList;
		
	}
	public Optional<Student> getStudent(String id) {
		return studentDAORepository.findById(id);
	}
	
	public void updateStudent(String id, Student student) {
		studentDAORepository.save(student);
	}

	public void deleteStudent(String id) {
		studentDAORepository.deleteById(id);
	}

	
	public void addStudent(Student student) {
		studentDAORepository.save(student);
	}
}
