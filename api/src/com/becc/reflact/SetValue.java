package com.becc.reflact;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Classname:SetValue
 * package:com.becc.reflact
 * Description:
 * DATE:2020/4/22  11:36
 * Author:boxifeng
 */
@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SetValue {
    String className() default "123";
    String methodName() default "123";
}
