package com.learn.mybatis.builder;

import com.learn.mybatis.exceptions.PersistenceException;

public class BuilderException  extends PersistenceException {
    public BuilderException(String message) {
        super(message);
    }
    public BuilderException(String message, Throwable cause) {
        super(message, cause);
    }
}
