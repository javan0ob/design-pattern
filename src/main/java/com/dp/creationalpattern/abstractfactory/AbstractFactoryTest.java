package com.dp.creationalpattern.abstractfactory;

//抽象工厂产生多个抽象零件
//抽象工厂由一组工厂方法组成
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new HuaweiComputerFactory();
        Disk disk = computerFactory.createDisk();
        disk.showInfo();
        Screen screen = computerFactory.createScreen();
        screen.showInfo();
    }
}
