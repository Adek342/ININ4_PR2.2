package com.company.devices;

import com.company.Saleable;
import com.company.creatures.Human;

public abstract class Device implements Saleable {
    final public String mark;
    final public String model;
    final public Integer yearOfProduction;
    final public String colour;
    final public Double value;

    public Device(String mark, String model, Integer yearOfProduction, String colour, Double value) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;
        this.value = value;
    }

    abstract void turnOn();

    public String toString() {
        return mark + " " + model + " " + " " + yearOfProduction;
    }

    @Override
    public void sell(Human Buyer, Human Seller, Double Price) throws Exception {
        if (Buyer.getCash() >= Price) {
            Buyer.setCash(Buyer.getCash() - Price);
            Seller.setCash(Seller.getCash() + Price);
        } else {
            throw new Exception("Not enough money");
        }

    }
}
