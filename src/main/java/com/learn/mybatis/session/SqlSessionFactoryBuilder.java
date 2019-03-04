package com.learn.mybatis.session;

import com.learn.mybatis.builder.xml.XMLConfigBuilder;
import com.learn.mybatis.exceptions.ExceptionFactory;
import com.learn.mybatis.session.defaults.DefaultSqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SqlSessionFactoryBuilder {
    public SqlSessionFactory build(InputStream inputStream) {
        // 调用重载方法
        return build(inputStream, null, null);
    }

    public SqlSessionFactory build(InputStream inputStream, String environment, Properties properties) {
        try {
            // 创建配置文件解析器
            XMLConfigBuilder parser = new XMLConfigBuilder(inputStream, environment, properties);
            // 调用 parse 方法解析配置文件，生成 Configuration 对象
            Configuration configuration = parser.parse();

            return build(configuration);
        } catch (Exception e) {
            throw ExceptionFactory.wrapException("Error building SqlSession.", e);
        } finally {
            //TODO
            //ErrorContext.instance().reset();
            try {
                inputStream.close();
            } catch (IOException e) {
                // Intentionally ignore. Prefer previous error.
            }
        }
    }

    public SqlSessionFactory build(Configuration config) {
        //创建 DefaultSqlSessionFactory
        DefaultSqlSessionFactory defaultSqlSessionFactory = new DefaultSqlSessionFactory(config);
        return defaultSqlSessionFactory;
    }
}
