package com.dp.creationalpattern.factorymethod;

public class AudiFactory implements CarFactory{
    @Override
    public Car create(String owner) {
        return new Audi(owner);
    }
}
