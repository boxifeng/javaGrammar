package com.becc.interfacetest.test;

public class Mouse implements Usb {
    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");

    }
    void click(){
        System.out.println("单击功能");
    }
}
