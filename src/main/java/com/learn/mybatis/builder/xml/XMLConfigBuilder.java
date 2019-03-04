package com.learn.mybatis.builder.xml;

import com.learn.mybatis.builder.BaseBuilder;
import com.learn.mybatis.builder.BuilderException;
import com.learn.mybatis.executor.ErrorContext;
import com.learn.mybatis.parsing.XNode;
import com.learn.mybatis.parsing.XPathParser;
import com.learn.mybatis.session.Configuration;

import java.io.InputStream;
import java.util.Properties;

public class XMLConfigBuilder extends BaseBuilder {

    private boolean parsed;
    private String environment;
    private final XPathParser parser;

    private XMLConfigBuilder(XPathParser parser, String environment, Properties props) {
        super(new Configuration());
        ErrorContext.instance().resource("SQL Mapper Configuration");
        this.configuration.setVariables(props);
        this.parsed = false;
        this.environment = environment;
        this.parser = parser;
    }

    public XMLConfigBuilder(InputStream inputStream, String environment, Properties props) {
        this(new XPathParser(inputStream, true, props, new XMLMapperEntityResolver()), environment, props);
    }

    public Configuration parse() {

        if (parsed) {
            throw new BuilderException("Each XMLConfigBuilder can only be used once.");
        }
        parsed = true;
        // 解析配置
        XNode xNode = parser.evalNode("/configuration");
        parseConfiguration(xNode);
        return configuration;
    }
    private void parseConfiguration(XNode root) {

    }
}
