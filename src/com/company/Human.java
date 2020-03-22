package com.company;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary = 1000.0;
    private Double monthlyEarning;

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
        if(human.salary >= car.value || (human.monthlyEarning * 12) >= car.value) {
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
}
