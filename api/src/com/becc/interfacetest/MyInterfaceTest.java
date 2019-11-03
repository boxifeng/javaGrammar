package com.becc.interfacetest;

/**
 * 任何版本的接口均可定义抽象方法
 * 格式
 * public abstract 返回值 方法名(参数);
 * 注意事项
 * 1、接口中的抽象方法 ，修饰符固定是public abstract
 * 2、这两个修饰符可以选择性的省略
 */
public interface MyInterfaceTest {
    /**
     * 以下四种格式均是正确的
     */
    public abstract void method01();

    public void method02();

    abstract void method03();

    void method04();

}
