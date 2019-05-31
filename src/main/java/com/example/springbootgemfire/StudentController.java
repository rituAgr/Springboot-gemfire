package com.example.springbootgemfire;

import com.example.springbootgemfire.model.Student;
import com.example.springbootgemfire.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @Autowired
    private StudentRepository repository;

    @PostMapping("/Student")
    public void save(@RequestBody Student student){
        repository.save(student);
    }
}