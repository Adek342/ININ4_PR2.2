package com.company.devices;

public class Car {
    final String mark;
    final String model;
    final Integer yearOfProduction;
    final Double engineCapacity;
    final String colour;
    private Double value;

    public Car(String mark, String model, Integer yearOfProduction, Double engineCapacity, String colour, Double value) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.colour = colour;
        this.value = value;
    }

    public String toString(){
        return mark + " " + model + " " + " " + yearOfProduction;
    }

    public Double getValue() {
        return value;
    }
}
