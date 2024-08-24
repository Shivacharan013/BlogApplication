package com.blogapplication.BlogApplication.controller;

import com.blogapplication.BlogApplication.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    public Student getStudent(){
        Student student=new Student(1,"shiva","charan");
        return student;
    }
    @GetMapping("students/{id}")
    public Student studentwithpathvariable(@PathVariable("id") int studentid){
        return new Student(studentid,"s","c");
    }
}
