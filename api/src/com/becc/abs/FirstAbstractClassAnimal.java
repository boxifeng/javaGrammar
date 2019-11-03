package com.becc.abs;

/**
 * 抽象方法：加上abstract关键字，去掉大括号及是抽象方法
 * 抽象方法所在的类必须是抽象类
 *
 *
 * 如何使用抽象类
 * 1、抽象类不能直接直接创建 new出来（不知道具体时间什么动物）
 * 2、必须创建一个子类来继承抽象父类
 * 3、子类必须重写覆盖父类中的所有抽象方法，并去抽象化（）
 */
public abstract class FirstAbstractClassAnimal {
    /**
     * 这是个抽象方法（不知道具体吃什么）
     */
     abstract void eat();

    /**
     * 这是一个普通方法
     */
    public void normalMethod(){}
}
