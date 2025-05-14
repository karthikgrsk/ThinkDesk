package com.example.ThinkDesk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
    @Autowired
    StudentRespository repo;
    
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        List<Student> lStudents=repo.findAll();
        return lStudents; 
    }
}
