package com.becc.multi.method;

/**
 * 如果方法被重写了，new的是谁优先用谁，
 * 没有向上找
 *
 * 口诀 成员方法 ：编译看左边，运行看右边
 *      成员变量：编译看左边，运行还看左边
 */
public class Test
{
    public static void main(String[] args) {
        Father father = new Son();
        father.method();
    }
}
