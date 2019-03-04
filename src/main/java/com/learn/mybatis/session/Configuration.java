package com.learn.mybatis.session;

import com.learn.mybatis.type.TypeAliasRegistry;
import com.learn.mybatis.type.TypeHandlerRegistry;

import java.util.Properties;

public class Configuration {

    protected Properties variables = new Properties();
    protected final TypeAliasRegistry typeAliasRegistry = new TypeAliasRegistry();
    protected final TypeHandlerRegistry typeHandlerRegistry = new TypeHandlerRegistry();

    public void setVariables(Properties variables) {
        this.variables = variables;
    }

    public TypeAliasRegistry getTypeAliasRegistry() {
        return typeAliasRegistry;
    }

    public TypeHandlerRegistry getTypeHandlerRegistry() {
        return typeHandlerRegistry;
    }
}
