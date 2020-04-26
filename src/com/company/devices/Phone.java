package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device{
    public Phone(String mark, String model, Integer yearOfProduction,String colour, Double value) {
        super(mark, model, yearOfProduction, colour, value);
    }

    @Override
    void turnOn() {
        System.out.println("Good morning");
    }

    @Override
    public void sell(Human Buyer, Human Seller, Double Price) throws Exception {
        if(Buyer.getCash() >= Price )
        {
            Buyer.phone = this;
            Seller.phone = null;
        } else System.out.println("I'm sorry");
    }
}
