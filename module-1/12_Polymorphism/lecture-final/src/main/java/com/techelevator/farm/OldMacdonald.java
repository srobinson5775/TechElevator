package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {
		System.out.println("-----------------------------------------------");
		System.out.println("            Old MacDonald Karaoke App ");
		System.out.println("_______________________________________________");
		System.out.println(
				"                              __.----.___\n" +
						" ||            ||  (\\(__)/)-'||      ;--` ||\n" +
						"_||____________||___`(QQ)'___||______;____||_\n" +
						"-||------------||----)  (----||-----------||-\n" +
						"_||____________||___(o  o)___||______;____||_\n" +
						"-||------------||----`--'----||-----------||-\n" +
						" ||            ||       `|| ||| || ||     ||jgs\n" +
						"^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println();
		Cow cow = new Cow();
		Chicken chicken = new Chicken();
		Pig pig = new Pig();
		Dog dog = new Dog();
		Tractor tractor = new Tractor();
		Egg egg = new Egg();


		//FarmAnimal[] farmAnimals = new FarmAnimal[] { cow, chicken, pig, dog};
		Singable[] singables = new Singable[] {cow, chicken, pig, dog, tractor};

		//for (FarmAnimal animal : farmAnimals) {
		for (Singable singable : singables) {
			//String name = animal.getName();
			//String sound = animal.getSound();
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}


		//Create business logic to display items that are sellable - create a Sellable interface
		Sellable[] sellables = new Sellable[]{cow, pig, egg};
		for(Sellable sellable : sellables){
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}


	}
}