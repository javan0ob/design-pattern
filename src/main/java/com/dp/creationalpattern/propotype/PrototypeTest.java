package com.dp.creationalpattern.propotype;

//原型模式即根据一个对象拷贝出一个新的对象
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = new Cat();
        cat.setName("ranran");
        cat.setWeight("10kg");
        cat.setColor("black");
        System.out.println(cat);

        Cat cloneCat = cat.clone();
        System.out.println(cloneCat);

        System.out.println(cat.hashCode());
        System.out.println(cloneCat.hashCode());
    }
}
