package com.becc.interfacetest.test;

public class Keyboard implements Usb {
    @Override
    public void open() {
        System.out.println("键盘开启");

    }

    @Override
    public void close() {
        System.out.println("键盘关闭");

    }
    void hit(){
        System.out.println("敲击功能");
    }
}
