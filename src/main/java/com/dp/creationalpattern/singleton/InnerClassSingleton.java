package com.dp.creationalpattern.singleton;

//使用匿名内部类初始化实例
public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    private static class SingletonHolder {
        private static InnerClassSingleton singleton = new InnerClassSingleton();
    }

    public static InnerClassSingleton getSingleton() {
        return SingletonHolder.singleton;
    }
}
