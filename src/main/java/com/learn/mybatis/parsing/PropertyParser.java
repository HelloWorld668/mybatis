package com.learn.mybatis.parsing;

import java.util.Properties;

public class PropertyParser {
    public static String parse(String string, Properties variables) {
        VariableTokenHandler handler = new VariableTokenHandler(variables);
        GenericTokenParser parser = new GenericTokenParser("${", "}", handler);
        return parser.parse(string);
    }
}
