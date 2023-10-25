package com.student.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private String id;
	private String studentName;
	private String schoolName;
	public Student() {
		super();
		
	}
	public Student(String id, String studentName, String schoolName) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.schoolName = schoolName;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	

}
