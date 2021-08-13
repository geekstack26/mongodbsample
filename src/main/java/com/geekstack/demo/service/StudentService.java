package com.geekstack.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekstack.demo.model.Student;
import com.geekstack.demo.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;

	public Student saveStudent(Student student) {
		return studentRepo.save(student);

	}

	public List<Student> saveAllStudent(List<Student> students) {
		return studentRepo.saveAll(students);

	}

	public Student getstudnetById(String id) {
		return studentRepo.findById(id).get();

	}

	public List<Student> getAllStudents() {
		return studentRepo.findAll();

	}
}
