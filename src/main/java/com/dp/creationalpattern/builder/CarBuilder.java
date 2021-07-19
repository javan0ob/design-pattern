package com.dp.creationalpattern.builder;

interface CarBuilder {
    CarBuilder name(String name);

    CarBuilder companyName(String companyName);

    CarBuilder owner(String owner);

    Car build();
}
