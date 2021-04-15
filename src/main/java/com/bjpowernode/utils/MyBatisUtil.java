package com.bjpowernode.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 林哥哥
 */
public class MyBatisUtil {

    private static SqlSessionFactory factory = null;

    static {
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        if (factory!=null){
            sqlSession = factory.openSession();  //非自动提交事务
        }
        return sqlSession;
    }


}
