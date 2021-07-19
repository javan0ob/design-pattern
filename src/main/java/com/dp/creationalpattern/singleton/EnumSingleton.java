package com.dp.creationalpattern.singleton;

/**
 * 不能反射获取实例，安全
 * 原理：产生一个EnumSingleton类继承Enum，通过静态代码块对SINGLETON进行赋值
 */
public enum EnumSingleton {
    SINGLETON;

    public void say() {
        System.out.println("hello world");
    }
}
