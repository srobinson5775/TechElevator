package com.techelevator;

import java.time.LocalDate;

public class DemoApp {
    public static void main(String[] args) {


        LocalDate now = LocalDate.now();

        // two different objects with same info
        Person person1 = new Person("James", "Kirk", now, "123-456-789");
        Person person2 = new Person("James", "Kirk", now, "123-456-789");

        // different objects so == returns false
        if (person1 == person2) {
            System.out.println("Memory locations are equal");
        } else {
            System.out.println("Memory locations are not equal");
        }

        // by default, equals will compare memory locations
        //
        // we can define equals and hashCode methods in an object to
        // determine what equality means in terms of values and hashes
        //
        // once we do that, objects will be compared using the data in the equals / hash methods
        if (person1.equals(person2)) {
            System.out.println("Object values are equal");
        } else {
            System.out.println("Object values are not equal");
        }





    }

}
