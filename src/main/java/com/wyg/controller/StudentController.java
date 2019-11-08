package com.wyg.controller;

import com.wyg.entity.Student;
import com.wyg.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> getStudentList(){
        List<Student> studentList = studentService.getStudentList();
        return studentList;
    }
}
