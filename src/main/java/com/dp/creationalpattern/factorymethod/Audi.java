package com.dp.creationalpattern.factorymethod;

public class Audi implements Car {
    private String owner;

    Audi(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this.owner + " use car!");
    }
}
