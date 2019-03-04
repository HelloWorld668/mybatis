package com.learn.mybatis.io;

import java.io.InputStream;

public class ClassLoaderWrapper {


    ClassLoader defaultClassLoader;
    ClassLoader systemClassLoader;


    ClassLoaderWrapper() {
        System.out.println("ClassLoaderWrapper");
        try {
            systemClassLoader = ClassLoader.getSystemClassLoader();
            System.out.println(systemClassLoader == null);
        } catch (SecurityException ignored) {
            // AccessControlException on Google App Engine
        }
    }


    public InputStream getResourceAsStream(String resource, ClassLoader classLoader) {
        return getResourceAsStream(resource, getClassLoaders(classLoader));
    }

    ClassLoader[] getClassLoaders(ClassLoader classLoader) {
        return new ClassLoader[]{
                classLoader,
                defaultClassLoader,
                Thread.currentThread().getContextClassLoader(),
                getClass().getClassLoader(),
                systemClassLoader};
    }

    InputStream getResourceAsStream(String resource, ClassLoader[] classLoader) {
        for (ClassLoader cl : classLoader) {
            if (null != cl) {

                // try to find the resource as passed
                InputStream returnValue = cl.getResourceAsStream(resource);

                // now, some class loaders want this leading "/", so we'll add it and try again if we didn't find the resource
                if (null == returnValue) {
                    returnValue = cl.getResourceAsStream("/" + resource);
                }

                if (null != returnValue) {
                    return returnValue;
                }
            }else {
                System.out.println("null");
            }
        }
        return null;
    }
}
