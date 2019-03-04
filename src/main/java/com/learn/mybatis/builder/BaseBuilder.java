package com.learn.mybatis.builder;

import com.learn.mybatis.session.Configuration;
import com.learn.mybatis.type.TypeAliasRegistry;
import com.learn.mybatis.type.TypeHandlerRegistry;



public abstract class BaseBuilder {

    protected final Configuration configuration;
    protected final TypeAliasRegistry typeAliasRegistry;
    protected final TypeHandlerRegistry typeHandlerRegistry;


    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
        this.typeAliasRegistry = this.configuration.getTypeAliasRegistry();
        this.typeHandlerRegistry = this.configuration.getTypeHandlerRegistry();
    }


}
