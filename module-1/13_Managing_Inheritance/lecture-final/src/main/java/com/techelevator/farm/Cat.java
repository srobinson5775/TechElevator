package com.techelevator.farm;

public class Cat extends FarmAnimal {

    public Cat(){
        super("Cat", "meow!");
    }

    @Override
    public String eat(){
        return "Eating cat food...";
    }



//    @Override  //cant override since getSound in FarmAnimal is final
//    public String getSound(){
//        return "Hello!";
//    }


}
