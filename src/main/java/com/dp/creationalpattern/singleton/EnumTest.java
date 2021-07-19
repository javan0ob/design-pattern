package com.dp.creationalpattern.singleton;

public class EnumTest {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.SINGLETON;
        singleton.say();
    }
}
