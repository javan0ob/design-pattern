package com.dp.creationalpattern.singleton;

//懒汉模式：使用时才会创建，节省内存
public class LazySingleton {
    private LazySingleton() {
    }

    //volatile保证有序性，防止指令重排序
    private static volatile LazySingleton singleton;

    public static LazySingleton getSingleton() {
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                //双重检查，防止在blockSet里的线程抢到锁后继续创建LazySingleton
                if (singleton == null) {
                    singleton = new LazySingleton();
                    /**
                     *  1.new 开辟内存空间
                     *  2.dup
                     *  3.invokespecial 构造方法<init>初始化
                     *  4.astore_1 给局部变量赋值
                     *
                     *  正常流程：1->2->3->4
                     *  指令重排序后：1->2->4->3
                     *  4在3之前执行，导致未初始化的实例赋值给局部变量，如果使用实例就会出错
                     */
                }
            }
        }
        return singleton;
    }
}
