package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
	private String name;//properties
	private String sound;
	private boolean isAsleep; //if animal is sleeping zzz for sound

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public abstract String eat();//abstract methods have no logic must be implemented buy concrete classes

	public void sleep(boolean isAsleep){
		this.isAsleep = isAsleep;
	}

	//gettters
	public String getName( ) {
		return name;
	}
	public final String getSound( ) {
		String animalSound = sound;
		if (isAsleep){
			animalSound = "Zzzzzzz....";
		}

		return animalSound;
	}

}