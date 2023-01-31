package com.techelevator;

public class Lecture {

	public static void main(String[] args) {


		System.out.println();
		System.out.println("*************************************************************");
		System.out.println("******         Debugging demo                          ******");
		System.out.println("*************************************************************");
		System.out.println();

		//Create an instance of the ExampleMethods class / object
		ExampleMethods exampleMethods = new ExampleMethods();

		String midPartValue = exampleMethods.middlePart("code");
		System.out.println(midPartValue);

		boolean hasDoubleX = exampleMethods.repeatX("axxbb");
		System.out.println(hasDoubleX);

		String strParts = exampleMethods.stringParts("Hello");
		System.out.println(strParts);

		char[] bulkOrder = exampleMethods.buildBulkOrder(6);
		System.out.println(bulkOrder);

	}
}
