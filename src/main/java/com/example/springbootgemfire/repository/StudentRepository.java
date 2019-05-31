package com.example.springbootgemfire.repository;

import com.example.springbootgemfire.model.Student;
import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends GemfireRepository<Student,String> {
}