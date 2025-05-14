package com.example.ThinkDesk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
 


@RestController
public class StudentController {
    @Autowired
    StudentRespository repo;
    
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        List<Student> lStudents=repo.findAll();
        return lStudents; 
    }
    @GetMapping("/students/{id}")
    public Student getMethodName(@PathVariable int id) {
        Student student = repo.findById(id).get();
        return student;
    }

    @PostMapping("/student/add")
    @ResponseStatus(code=HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student){
        repo.save(student);
    }
    @PutMapping("/student/update/{id}")
    public Student putMethodName(@PathVariable int id) {
       Student student=repo.findById(id).get();
        student.setName("raju");
        student.setBranch("zoho");
        student.setCgpa(9.8);
        repo.save(student);
        return student;
    }
    
}
