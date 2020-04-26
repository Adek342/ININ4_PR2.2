package com.company;


import com.company.creatures.Human;

public interface Saleable {
    public void sell(Human Buyer, Human Seller, Double Price) throws Exception;
}
