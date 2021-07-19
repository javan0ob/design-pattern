package com.dp.creationalpattern.propotype;

//重写clone()方法前需要实现Cloneable
public class Cat implements Cloneable {
    private String name;
    private String weight;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Cat clone() throws CloneNotSupportedException {
        return (Cat) super.clone();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
