package com.wyg.service.impl;

import com.wyg.dao.StudentDao;
import com.wyg.datasources.annotation.DataSource;
import com.wyg.entity.Student;
import com.wyg.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Transactional
    @Override
    @DataSource("second")
    public List<Student> getStudentList() {
        return studentDao.getStudentList();
    }
}
