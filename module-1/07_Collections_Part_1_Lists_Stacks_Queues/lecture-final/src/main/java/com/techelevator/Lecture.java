package com.techelevator;

import java.util.*;


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
		for(int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}



		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Sam");
		for(int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(2, "Boromir");
		for(int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(2);
		for(int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		boolean inList = names.contains("Samwise");
		System.out.println("Samwise is in the list of names: " + inList);




		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfGandalf = names.indexOf("Gandalf");
		System.out.println("Gandalf is located at index: " + indexOfGandalf);



		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");


		String[] namesArray = names.toArray(new String[0]);

		for (int i = 0; i < namesArray.length; i++){
			System.out.println(namesArray[i]);
		}


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(names);  //Sort() modifies the original list.
		for(int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}



		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		Collections.reverse(names);  //Reverse() modifies the original list.
		for(int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		//for each name in names
		//print the name
		for(String name : names){
			System.out.println(name);


		}






		//---------------------QUEUES-----------------------
		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();


		Queue<String> customers = new LinkedList<String>();
		customers.offer("Batman");
		customers.offer("The Joker");
		customers.offer("Robin");
		//checking to see what's next
		String next = customers.peek(); //checking next element - reading it using peek
		System.out.println(next);
		System.out.println(customers.size());


		next = customers.poll(); //taking action on next element - removing it using poll()
		System.out.println(next);
		System.out.println(customers.size());

		next = customers.poll(); //taking action on next element - removing it using poll()
		System.out.println(next);
		System.out.println(customers.size());


		//foreach - can read items but can't modify any of them
		for(String customer : customers){
			System.out.println(customer);
		}

		System.out.println(customers.size());
		//To remove from queue use the while loop
		while (customers.size() > 0){
			String customerName = customers.poll(); //item is removed; returns removed item
			System.out.println(customerName);
		}
		System.out.println(customers.size());





		//---------------------STACKS-----------------------
		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();

		//Stack<Integer> warehousePallets = new Stack<Integer>();
		Stack<Integer> warehousePallets = new Stack<>();
		warehousePallets.push(1010);
		warehousePallets.push(3020);
		warehousePallets.push(5130);

		Integer pallet = warehousePallets.peek();
		System.out.println(pallet);
		System.out.println(warehousePallets.size());

		//pallet = warehousePallets.pop();
		System.out.println(pallet);
		System.out.println(warehousePallets.size());

		//pallet = warehousePallets.pop();
		System.out.println(pallet);
		System.out.println(warehousePallets.size());


		//foreach - can read items but can't modify any of them
		for(Integer wPallet : warehousePallets){
			System.out.println(wPallet);
		}

		System.out.println(warehousePallets.size());
		//To remove from stack use the while loop
		while (warehousePallets.size() > 0){
			Integer wPallet = warehousePallets.pop(); //item is removed; returns removed item
			System.out.println(wPallet);
		}
		System.out.println(warehousePallets.size());




	}
}
