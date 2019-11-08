package com.wyg.dao;

import com.wyg.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherDao {
    List<Teacher> getTeacherList();
}
