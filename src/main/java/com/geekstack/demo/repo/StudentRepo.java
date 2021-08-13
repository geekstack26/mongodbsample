package com.geekstack.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.geekstack.demo.model.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student, String> {

}
