package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {
		System.out.println("-----------------------------------------------");
		System.out.println("            Old MacDonald Karaoke ");
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
		cow.sleep(false);

		Chicken chicken = new Chicken();
		Pig pig = new Pig();

		pig.sleep(false);
		Tractor tractor = new Tractor();

		Cat cat = new Cat();
		cat.sleep(true);

		//FarmAnimal farmAnimal = new FarmAnimal("CowChickenPigCat", "MooCluckOinkMeow");


		Singable[] singables =
				new Singable[] {cow, chicken, pig, cat, tractor};

		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		Sellable[] sellables = new Sellable[] {new Cow(), new Pig(), new Egg()};

		for (Sellable sellable : sellables) {
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}
	}
}