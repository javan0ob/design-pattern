package com.dp.creationalpattern.singleton;

//饿汉模式：主动使用就会初始化，可能存在浪费内存空间的行为（例如调用了getName方法导致singleton初始化）
public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton = new Singleton();

    public static Singleton getSingleton() {
        return singleton;
    }

    public static String getName() {
        return "饿汉模式";
    }
}
