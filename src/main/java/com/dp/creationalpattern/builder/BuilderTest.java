package com.dp.creationalpattern.builder;

//spring中使用builder模式的类BeanDefinitionBuilder
public class BuilderTest {
    public static void main(String[] args) {
        CarBuilder carBuilder = new Car.Builder();
        Car car = carBuilder.name("Audi").companyName("shangqi").owner("ranran").build();
        System.out.println(car);
    }
}
