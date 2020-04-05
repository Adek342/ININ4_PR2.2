package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private Car car;
    private Double salary = 1000.0;
    private Double monthlyEarning;

    public Human() {
        super("Homo sapiens");
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void monthlyEarning(double v) {
        monthlyEarning = v;
    }
    public void setCar(Car car, Human human) {
        if(human.salary >= car.getValue() || (human.monthlyEarning * 12) >= car.getValue()) {
            System.out.println("Congrats");
            this.car = car;
        }
        else {
            System.out.println("I'm sorry");
        }
    }
    public Car getCar()
    {
        return car;
    }
    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}
