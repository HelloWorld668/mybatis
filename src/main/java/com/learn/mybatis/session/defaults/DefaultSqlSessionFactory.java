package com.learn.mybatis.session.defaults;

import com.learn.mybatis.session.Configuration;
import com.learn.mybatis.session.SqlSessionFactory;

public class DefaultSqlSessionFactory  implements SqlSessionFactory {
    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }
}
