package com.geekstack.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.geekstack.demo.model.Student;
import com.geekstack.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/student.add")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);

	}

	@PostMapping("/student.add.all")
	public List<Student> saveStudents(@RequestBody List<Student> students) {
		return studentService.saveAllStudent(students);

	}

	@GetMapping("/student.load.all")
	public List<Student> loadStudents() {
		return studentService.getAllStudents();

	}

	@GetMapping("/student.load/{id}")
	public Student loadStudent(@PathVariable String id) {
		try {
			return studentService.getstudnetById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
