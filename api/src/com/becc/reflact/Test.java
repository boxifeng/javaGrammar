package com.becc.reflact;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Classname:Test
 * package:com.becc.reflact
 * Description:
 * DATE:2020/4/22  11:15
 * Author:boxifeng
 */
@SetValue(className = "com.becc.reflact.Person",methodName = "eat")
public class Test {
    public static void main(String[] args) throws Exception {
        Class<Test> testClass = Test.class;
        SetValue annotation = testClass.getAnnotation(SetValue.class);

        Class cls = Class.forName(annotation.className());
        Object o = cls.newInstance();
        System.out.println(cls);
        Method Method = cls.getMethod(annotation.methodName());
        Method.invoke(o);
    }
}
