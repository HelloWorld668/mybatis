package com.learn.mybatis.builder.xml;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.Locale;

public class XMLMapperEntityResolver implements EntityResolver{
    @Override
    public InputSource resolveEntity(String publicId, String systemId) throws SAXException {
            return null;

    }
}
