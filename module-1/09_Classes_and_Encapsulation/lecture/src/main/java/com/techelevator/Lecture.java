package com.techelevator;

import java.util.*;

public class Lecture {

    public static void main(String[] args) {
        System.out.println("############################");
        System.out.println("Classes and Encapsulation");
        System.out.println("############################");


        //create an instance of dog
        Dog dog1 = new Dog();

        Dog dog2 = new Dog("Camila", 2, "Chihuahua");

        dog2.setOwner("Shaylyn");

        System.out.println("Dog name: " + dog2.getName() + " Owner: " + dog2.getOwner());
    }
}
