package com.techelevator.farm;

public class Tractor implements Singable {

    private String name;
    private String sound;
    //properties that exist in the tractor class

    public Tractor(){
        name = "Tractor";
        sound = "vroom!";
    }

    public String getName(){
        return name;
    }

    public String getSound(){
        return sound;
    }

}
