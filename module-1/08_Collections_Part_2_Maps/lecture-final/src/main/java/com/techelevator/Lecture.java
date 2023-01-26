package com.techelevator;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		//Declaring and initializing a Map
		Map<String, String> nameToZip = new HashMap<>();

		// Adding an item to a Map
		nameToZip.put("Neo", "19107");
		nameToZip.put("Morpheus", "19146");
		nameToZip.put("Trinity", "19125");

		//Retrieving an item from a Map
		System.out.println("Neo lives in " + nameToZip.get("Neo"));
		System.out.println("Morpheus lives in " + nameToZip.get("Morpheus"));
		System.out.println("Trinity lives in " + nameToZip.get("Trinity"));

		//Retrieving just the keys from a Map
		System.out.println("Looping through map using keys...");

		Set<String> keys = nameToZip.keySet(); //returns a collection of all of the keys in the map
		for (String key : keys) {
			System.out.println(key + " lives in " + nameToZip.get(key));
		}
		System.out.println();



		//Check to see if a key already exists
		if(nameToZip.containsKey("Neo")){
			System.out.println("Neo exists"); //update logic
		}
		else{
			//add logic
		}

		nameToZip.put("Neo","12345");  //If already exists then value is updated, otherwise key-value is added
		for (String key : keys) {
			System.out.println(key + " lives in " + nameToZip.get(key));
		}

		System.out.println();

		// Iterate through the key-value pairs in the Map
		for (Map.Entry<String, String> nameZip : nameToZip.entrySet()){
			System.out.println(nameZip.getKey() + " lives in: " + nameZip.getValue());
		}

		System.out.println();
		//Remove an element from the map
		nameToZip.remove("Neo");
		System.out.println("removed Neo");
		System.out.println();

		for (Map.Entry<String, String> nameZip : nameToZip.entrySet()){
			System.out.println(nameZip.getKey() + " lives in: " + nameZip.getValue());
		}


		System.out.println("Matrix character");
		//Given the name of a Matrix character, return the actor's real name
		// the character name should be case-insensitive so "neo", "Neo", and "NEO" should all return
		// should handle null values gracefully

		System.out.println();
		System.out.println();

		//Given character name
		String character = "NeO";

		Map<String, String> matrixCharacters = new HashMap<>();
		// Adding an item to a Map
		matrixCharacters.put("neo", "Keanu Reeves");
		matrixCharacters.put("morpheus", "Laurence Fishburne");
		matrixCharacters.put("trinity", "Carrie-Anne Moss");




		if(character != null && matrixCharacters.containsKey(character.toLowerCase())){
			System.out.println(matrixCharacters.get(character.toLowerCase()));
		}else{
			System.out.println("Not in the Matrix");
		}

	}

}
