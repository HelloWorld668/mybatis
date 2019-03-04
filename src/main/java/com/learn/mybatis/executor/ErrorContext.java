package com.learn.mybatis.executor;

public class ErrorContext {

    private String resource;

    private static final ThreadLocal<ErrorContext> LOCAL = new ThreadLocal<>();
    public static ErrorContext instance() {
        ErrorContext context = LOCAL.get();
        if (context == null) {
            context = new ErrorContext();
            LOCAL.set(context);
        }
        return context;
    }
    public ErrorContext resource(String resource) {
        this.resource = resource;
        return this;
    }
}
