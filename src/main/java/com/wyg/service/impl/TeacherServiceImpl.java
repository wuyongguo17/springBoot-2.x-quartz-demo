package com.wyg.service.impl;

import com.wyg.dao.TeacherDao;
import com.wyg.datasources.annotation.DataSource;
import com.wyg.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    private TeacherDao teacherDao;

    @DataSource("first")
    @Override
    public List<Teacher> getTeacherList() {
        return teacherDao.getTeacherList();
    }
}
