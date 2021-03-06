package com.company.creatures;

import com.company.Saleable;

import java.io.File;
import java.sql.SQLOutput;

public class Animal implements Saleable, Edible {
    public final String species;
    protected Double weight;
    public String name;
    File pic;

    public static final Double DEAFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEAFAULT_MOUSE_WEIGHT = 0.01;
    public static final Double DEAFAULT_LION_WEIGHT = 123.0;

    public Animal(String species) {
        this.species = species;
        if (species == "dog") {
            this.weight = DEAFAULT_DOG_WEIGHT;
        } else if (species == "mouse") {
            this.weight = DEAFAULT_MOUSE_WEIGHT;
        } else if (species == "lion") {
            this.weight = DEAFAULT_LION_WEIGHT;
        }

    }

    public void feed() {
        if (weight > 0.0) {
            weight++;
            System.out.println("thx for food bro, " + weight + "kg");
        } else {
            System.out.println("Man! Your dog is dead you cannot feed him");
        }
    }

    public void takeForAWalk() {
        weight--;
        if (weight > 0.0) {
            System.out.println("thx for taking me for walk, " + weight + "kg");
        } else {
            System.out.println("Man! Your dog is dead you cannot take him for a walk");
            System.out.println("Your dog is dead");
        }

    }

    public boolean imDead() {
        if (weight <= 0.0) {
            System.out.println("Your dog is dead");
            return false;
        } else {
            return true;
        }

    }

    public String toString() {
        return this.species + " " + this.name;
    }

    @Override
    public void beEaten() {
    }

    @Override
    public void sell(Human Buyer, Human Seller, Double Price) throws Exception {
        if(Buyer.getCash() >= Price )
        {
            Buyer.pet = this;
            Seller.pet = null;
        } else System.out.println("I'm sorry");
    }
}

