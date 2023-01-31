package com.techelevator.farm;

public class Chicken extends FarmAnimal {

	public Chicken() {
		super("Chicken", "cluck!");
	}
	//chicken and sound comes from the farm animal constructor in FarmAnimal.java

	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

}