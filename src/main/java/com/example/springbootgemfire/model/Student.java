package com.example.springbootgemfire.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

@Region(value = "Client")
public class Student {

    @Id
    String id;
    String name;
}