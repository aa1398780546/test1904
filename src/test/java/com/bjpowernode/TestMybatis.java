package com.bjpowernode;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 林哥哥
 */
public class TestMybatis {


    @Test
    public void TestQueryStudentById(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        String id ="A0001";
        Student student = dao.QueryStudentById(id);
        System.out.println(student);
    }


    @Test
    public void TestQueryAllStudent(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = dao.QueryAllStudent();
        for (Student student: studentList){
            System.out.println("查询的学生:" + student);
        }
    }

}
