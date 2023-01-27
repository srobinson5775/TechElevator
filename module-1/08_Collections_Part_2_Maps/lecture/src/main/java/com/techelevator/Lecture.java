package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		//Declaring and initialing a Map
		Map<String, String> nameToZip = new HashMap<>();

		//Adding an item to a Map
		nameToZip.put("Neo", "19107");
		nameToZip.put("Morpheus", "19146");
		nameToZip.put("Trinity", "19125");

		//Retrieving an item from a Map
		System.out.println("Neo Lives in " + nameToZip.get("Neo"));
		System.out.println("Morpheus lives in " + nameToZip.get("Morpheus"));
		System.out.println("Trinity lives in " + nameToZip.get("Trinity"));

		//Retrieving just the keys from a Map
		System.out.println("Looping through map using keys...");

		Set<String> keys = nameToZip.keySet(); //returns a collection of all of the keys in the map
		for (String name : keys) {
			System.out.println(name + " lives in " + nameToZip.get(name));
		}
		System.out.println();

		//Check to see if a key already exists
		if(nameToZip.containsKey("Neo")) {
			System.out.println("Neo exisits"); //update logic
		} else {
			//add logic
		}

		nameToZip.put("Neo", "12345"); //if this key already exits then the value is updated, otherwise key-value is added
		for (String name : keys) {
			System.out.println(name + " lives in " + nameToZip.get(name));
		}
		System.out.println();

		//Iterate through the key-value pairs in the Map
		for (Map.Entry<String, String> nameZip : nameToZip.entrySet()){
			System.out.println(nameZip.getKey() + " lives in " + nameZip.getValue());
		}

		//remove an element from the map
		nameToZip.remove("Neo");
		System.out.println("removed Neo");
		System.out.println();

		for (Map.Entry<String, String> nameZip: nameToZip.entrySet()){
			System.out.println(nameZip.getKey() + " lives in" + nameZip.getValue());
		}



	}

}
