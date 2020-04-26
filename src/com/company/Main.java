package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Jacek";
        me.lastName = "Placek";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";
        me.pet.feed();
        Phone Iphone = new Phone("Iphone", "12", 2018, "red", 4000.0);

        System.out.println(me.pet.name);

        Animal dog = new Animal("dog");
        dog.name = "Akita";
        me.pet = dog;

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();

//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
//        me.pet.takeForAWalk();
    //    for (int i = 0; )
      //  do{
        //    me.pet.takeForAWalk();
        //}while (me.pet.imDead());

        Car passat = new Car("Volkswagen","Passat",1984,1.9,"Red", 14000.0);
        me.setCash(20000.0);
        me.monthlyEarning(4000.0);
        me.setCar(passat, me);
        System.out.println("my salary is: " + me.getCash());

        Human girlFriend = new Human();
        girlFriend.firstName = "Ela";
        girlFriend.lastName = "Pietruszka";
        girlFriend.setCash(320000.0);
        girlFriend.setCar(passat, girlFriend);

        System.out.println(me.getCar());
        System.out.println(girlFriend.getCar());

        System.out.println(me);
        System.out.println(girlFriend);
        System.out.println(me.species);
        me.feed();
        System.out.println("Czy Human jest człowiekiem i zwięrzęciem");
        System.out.println(me instanceof Human);
        System.out.println(me instanceof Animal);

        System.out.println("Czy moj zwierzak jest człowiekiem i zwięrzęciem");
        System.out.println(me.pet instanceof Human);
        System.out.println(me.pet instanceof Animal);
        me.phone = Iphone;

        Human human3 = new Human();
        human3.firstName = "Jan";
        human3.lastName = "Kowalski";
        human3.setCash(3000.0);

        System.out.println("");
        me.printCash();
        human3.printCash();
        System.out.println(me.getCar());
        System.out.println(human3.getCar());
        System.out.println("Sell auto: ");
        me.car.sell(human3, me, 200.0);
        System.out.println(me.getCar());
        System.out.println(human3.getCar());
        me.printCash();
        human3.printCash();
    }
}
