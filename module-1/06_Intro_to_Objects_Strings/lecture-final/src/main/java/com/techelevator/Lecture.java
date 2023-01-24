package com.techelevator;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */
		String greeting = "Hello, World!"; //using a literal
		System.out.println("greeting : " + greeting);


		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();


		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		System.out.println("***** charAt *****");
		String name = "Bart";

		char firstLetter = name.charAt(0);
		char thirdLetter = name.charAt(2);
		System.out.println(name);
		System.out.println(firstLetter);
		System.out.println(thirdLetter);



		System.out.println("***** contains *****");
		String hello = "Hello World!";
		System.out.println("hello : " + hello);
		boolean hasHello = hello.contains("Hello");
		System.out.println("hasHello : " + hasHello);
		boolean hasBogus = hello.contains("bogus");
		System.out.println("hasBogus : " + hasBogus);


		System.out.println("***** substring *****");
		String myString = "You are the one Neo";
		String mySubString = myString.substring(0, 7);
		String myOtherSubString = myString.substring(8);
		System.out.println(mySubString);
		System.out.println(myOtherSubString);
		System.out.println(myString);

		System.out.println("***** length() *****");
		System.out.println(myString.length());

		System.out.println("***** indexOf *****");
		int position = myString.indexOf('o');
		System.out.println(position);



		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

        char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
        String hello1 = new String(helloArray);
        String hello2 = new String(helloArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}


		System.out.println();
		System.out.println("*************************************************************");
		System.out.println("****** StringMethodsDemo examples using String methods ******");
		System.out.println("*************************************************************");
		System.out.println();

		//Create an instance of the StringMethodsDemo class / object
		StringMethodsDemo strMethodsDemo = new StringMethodsDemo();

		String midPartValue = strMethodsDemo.middlePart("code");
		System.out.println(midPartValue);

		boolean hasDoubleX = strMethodsDemo.repeatX("axxbb");
		System.out.println(hasDoubleX);


	}
}
