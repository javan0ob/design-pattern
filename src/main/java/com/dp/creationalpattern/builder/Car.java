package com.dp.creationalpattern.builder;

public class Car {
    private final String name;
    private final String companyName;
    private final String owner;

    public Car(String name, String companyName, String owner) {
        this.name = name;
        this.companyName = companyName;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    static class Builder implements CarBuilder{
        private String name;
        private String companyName;
        private String owner;

        @Override
        public CarBuilder name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public CarBuilder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        @Override
        public CarBuilder owner(String owner) {
            this.owner = owner;
            return this;
        }

        @Override
        public Car build() {
            return new Car(this.name, this.companyName, this.owner);
        }
    }
}
