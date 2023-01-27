package com.techelevator;

public class Dog {

    //Class variables - static
    public static final String ANCESTOR = "Wolf";
    public static int dogCount;


    //Instance variables / .this refers to instance variables  (P1 - Encapsulation private access modifiers)
    private String name;
    private int age;
    private String breed;
    private String owner;
    private String microChipId;



    //constructor
    public Dog(){
        this.age = 1;
    }

    public Dog(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;

        dogCount++;
    }

    //Getters and Setters (P2 - Encapsulation public getters and setters)
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
        if(age < 1){
            age = 1;
        }
    }

    public String getBreed(){
        return this.breed;
    }



    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String owner){
        //Call method / business logic verify owner background
        //if(valid) { //sudo code
        this.owner = owner;
    }


    public String getMicroChipId(){
        return this.microChipId;
    }
    public void setMicroChipId(String microChipId){
        this.microChipId = microChipId;
    }

    //Custom method
    public String bark(){
        return this.name + " says woof...woof!";
    }

    public String bark(String dogName){
        return dogName + " says woof...woof!";
    }



}
