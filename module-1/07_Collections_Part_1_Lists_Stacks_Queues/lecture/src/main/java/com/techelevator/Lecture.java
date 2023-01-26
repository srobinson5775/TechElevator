package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> names = new ArrayList<>();
		names.add("Frodo");
		names.add("Sam");
		names.add("Pippin");
		names.add("Merry");
		names.add("Gandalf");
		names.add("Aragorn");
		names.add("Gimli");
		names.add("Legolas");


		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		for (int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}




		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Sam");
		for (int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(2, "Boromir");
		for (int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(2);
		for (int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		boolean inList = names.contains("Samwise");
		System.out.println("Samewise is in the list of names: " + inList);
		//.contains is case sensitive


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfGandalf = names.indexOf("Gandalf");//how to find the indext of a item
		System.out.println("Gandalf is located at index: " + indexOfGandalf);
		//will only find the first index of whats asked


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		String[] namesArray = names.toArray(new String[0]);//creates a empty array

		for (int i = 0; i < namesArray.length; i++){
			System.out.println(namesArray[i]);
		}





		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################"); //modifies the orginial list

		Collections.sort(names); //Sort() modifies the original list it organizes it.

		for( int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		Collections.reverse(names); // Reverse() modifies the orginial list
		for( int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}





		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		//for each name in names for (String name : names)
		//print the name

		for (String name : names) {
			System.out.println(name);

		}


	}
}
