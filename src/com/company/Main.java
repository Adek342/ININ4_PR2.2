package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Jacek";
        me.lastName = "Placek";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";
        me.pet.feed();

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
        me.setSalary(20000.0);
        me.monthlyEarning(4000.0);
        me.setCar(passat, me);
        System.out.println("my salary is: " + me.getSalary());

        Human human2 = new Human();
        human2.firstName = "Ela";
        human2.lastName = "Pietruszka";
        human2.setSalary(320000.0);
        human2.setCar(passat, human2);

        System.out.println(me.getCar());
        System.out.println(human2.getCar());
    }
}
