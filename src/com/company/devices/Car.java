package com.company.devices;

import com.company.creatures.Human;

public class Car extends Device {
    final Double engineCapacity;

    public Car(String mark, String model, Integer yearOfProduction, Double engineCapacity, String colour, Double value) {
        super(mark, model, yearOfProduction, colour, value);
        this.engineCapacity = engineCapacity;
    }

    public Double getValue() {
        return value;
    }

    @Override
    void turnOn() {
        System.out.println("engine is on");
    }

    @Override
    public void sell(Human Buyer, Human Seller, Double Price) throws Exception {
        try {
            super.sell(Buyer, Seller, Price);
            Buyer.car = this;
            Seller.car = null;
        } catch (Exception e) {
            System.out.println("transaction failed");
        }
    }
}
