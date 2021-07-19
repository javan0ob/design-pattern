package com.dp.creationalpattern.factorymethod;

//用于创建一类实例对象
public class FactoryMethodTest {
    public static void main(String[] args) {
        CarFactory audiFactory = new AudiFactory();
        Car audi = audiFactory.create("ranran");
        audi.use();
    }
}
