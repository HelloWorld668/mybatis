package com.learn.mybatis.exceptions;

public class PersistenceException  extends IbatisException {
    public PersistenceException(String message) {
        super(message);
    }

    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}
