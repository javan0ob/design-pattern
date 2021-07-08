package java.com.dp.creationalpattern.singleton;

//饿汉模式
public class Singleton {
    private Singleton() {
    }

    private static final Singleton SINGLETON = new Singleton();

    public static Singleton getSingleton() {
        return SINGLETON;
    }
}
