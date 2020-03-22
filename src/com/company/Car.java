package com.company;

public class Car {
    final String mark;
    final String model;
    final Integer yearOfProduction;
    final Double engineCapacity;
    final String colour;
    public Double value;

    public Car(String mark, String model, Integer yearOfProduction, Double engineCapacity, String colour, Double value) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.colour = colour;
        this.value = value;
    }
}
