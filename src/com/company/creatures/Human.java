package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    public Car car;
    private Double cash;
    private Double monthlyEarning;

    public final static Double DEFAULT_HUMAN_WEIGHT = 70.0;

    public Human() {
        super("Homo sapiens");
        this.weight = 60.0;
    }

    public Double getCash() {
        return cash;
    }
    public void printCash(){
        System.out.println(firstName + " " + lastName + ": " + cash);
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public void monthlyEarning(double v) {
        monthlyEarning = v;
    }

    public void setCar(Car car, Human human) {
        if (human.cash >= car.getValue() || (human.monthlyEarning * 12) >= car.getValue()) {
            System.out.println("Congrats");
            this.car = car;
        } else {
            System.out.println("I'm sorry");
        }
    }

    public Car getCar() {
        System.out.print(this.firstName + " " + this.lastName + ": ");
        return car;
    }

    @Override
    public void sell(Human Buyer, Human Seller, Double Price) throws Exception {
        throw new Exception("Human is not for sale");
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
