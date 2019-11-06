package com.becc.interfacetest.test;

public class Test
{
    public static void main(String[] args) {
        Usb mouse = new Mouse();
        Usb keyboard = new Keyboard();
        Laptop laptop = new Laptop();
        laptop.useUsb(mouse);
        laptop.useUsb(keyboard);
    }
}
