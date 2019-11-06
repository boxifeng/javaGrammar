package com.becc.interfacetest.test;

public class Laptop implements Usb {
    @Override
    public void open() {
        System.out.println("笔记本电脑开机");
    }

    @Override
    public void close() {
        System.out.println("笔记本电脑关机");
    }
    public void useUsb(Usb usb){
        usb.open();
        usb.close();
        if(usb instanceof Mouse){
            ((Mouse) usb).click();
        }
        if(usb instanceof Keyboard){
            ((Keyboard) usb).hit();
        }
    }
}
