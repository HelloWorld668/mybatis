package com.learn.mybatis.exceptions;

public class IbatisException extends RuntimeException{
    public IbatisException() {
        super();
    }
    public IbatisException(String message) {
        super(message);
    }
    public IbatisException(String message, Throwable cause) {
        super(message, cause);
    }
}
