package com.techelevator;

import java.util.*;

public class Lecture {

    public static void main(String[] args) {
        System.out.println("############################");
        System.out.println("Classes and Encapsulation");
        System.out.println("############################");


        //Dog dog1 = new Dog();
        Dog dog3 = new Dog("Snoopy", 65, "Beagle");
        System.out.println("Number of dog objects " + Dog.dogCount);
        Dog dog2 = new Dog("Giselle", 8, "Cockapoo");
        System.out.println("Number of dog objects " + Dog.dogCount);

        dog2.setOwner("Myron");



        //System.out.println("Dog name: " + dog2.getName() + " Owner: " + dog2.getOwner());
        System.out.println("Dog name: " + dog2.getName() + " Owner: " + dog2.getOwner());
        System.out.println(dog2.bark());
        System.out.println(dog3.bark());


        System.out.println("All dogs share the ancestor " + Dog.ANCESTOR);



    }
}
