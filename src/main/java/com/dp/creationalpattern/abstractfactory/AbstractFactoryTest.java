package com.dp.creationalpattern.abstractfactory;

/**
 * 抽象工厂产生多个抽象"零件"(一系列相关或相互依赖对象)
 * 抽象工厂由一组工厂方法组成
 * 符合单一职责和开闭原则
 * java.sql.Connection抽象工厂
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new HuaweiComputerFactory();
        Disk disk = computerFactory.createDisk();
        disk.showInfo();
        Screen screen = computerFactory.createScreen();
        screen.showInfo();
    }
}
