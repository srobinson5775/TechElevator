package com.techelevator;

public class Dog {

    //class variables - static
    public static final String ANCESTOR = "Wolf";
    public static int dogCount;

    //create Instance variables aka .this refers to instance variables
    private String name;
    private int age;
    private String breed;
    private String owner;
    private String microChipId;


    //constructor java created a contructor for Dog

    public Dog(){
        this.age = 1;
    }

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;



    }


    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if (age < 1) {
            age = 1;
        }
    }
    public String getBreed(){
        return this.breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String owner){
        //call method / business logic verify owner background
        //if (valid) //sudo code
        this.owner = owner;
    }
    //custom method overloading same name same class different paramenter
    public String bark(){
        return this.name + " says woof...woof!";
    }

    public String bark(String personName) {
        return this.name + " says woof woof! at delivery person!";
    }

    public void setMicroChipId(String microChipInput) {
    }
}
