package com.learn.mybatis.main;

import com.learn.mybatis.io.Resources;
import com.learn.mybatis.session.SqlSessionFactory;
import com.learn.mybatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class chapter1 {
    public static void main(String[] args) throws IOException {
        String resource = "chapter1/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);;
    }
}
