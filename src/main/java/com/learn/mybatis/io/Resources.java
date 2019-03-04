package com.learn.mybatis.io;

import java.io.IOException;
import java.io.InputStream;

public class Resources {
    private static ClassLoaderWrapper classLoaderWrapper = new ClassLoaderWrapper();

    public static InputStream getResourceAsStream(String resource) throws IOException {
        System.out.println("getResourceAsStream");
        return getResourceAsStream(null, resource);
    }

    public static InputStream getResourceAsStream(ClassLoader loader, String resource) throws IOException {
        InputStream in = classLoaderWrapper.getResourceAsStream(resource, loader);
        if (in == null) {
            throw new IOException("Could not find resource " + resource);
        }
        return in;
    }


}
