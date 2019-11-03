package com.becc.interfacetest;

/**
 * java 8 开始支持接口中创建默认方法
 *  格式：
 *       public default 方法名称(参数){
 *           方法体
 *       }
 *  目的：
 *      方便接口升级使用
 */
public interface MyInterfaceDefault {
    public abstract void method01();
    public default void method02(){
        System.out.println("调用接口的默认方法，这个方法来自于" + MyInterfaceDefault.class.getSimpleName());
    }
}
