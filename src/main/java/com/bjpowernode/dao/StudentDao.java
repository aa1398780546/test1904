package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 林哥哥
 */
public interface StudentDao {

    //根据id号查询该学生所有信息
    Student QueryStudentById(@Param("stuid") String id);

    //插入一条学生信息
    int InsertStudentInfo(Student student);

    //查询所有学生信息
    List<Student> QueryAllStudent();
}
