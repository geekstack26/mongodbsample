package com.geekstack.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Student {

	@Id
	@Field
	private String studentId;
	@Field("studnet_name")
	private String name;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}

	public Student() {
		super();
	}

}
