package com.wyg.dao;

import com.wyg.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {

    List<Student> getStudentList();
}
