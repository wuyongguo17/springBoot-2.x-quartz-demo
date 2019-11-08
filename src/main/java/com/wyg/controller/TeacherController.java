package com.wyg.controller;

import com.wyg.entity.Teacher;
import com.wyg.service.impl.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/list")
    public List<Teacher> getTeacherList(){
        List<Teacher> teacherList = teacherService.getTeacherList();
        return teacherList;
    }
}
