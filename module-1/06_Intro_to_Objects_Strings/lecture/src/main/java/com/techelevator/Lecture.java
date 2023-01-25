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

		String greeting = "Hello World"; // using a litteral ("Hello World")
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


		System.out.println("****** charAt ******");
		String name = "Bart";
		char firstLetter = name.charAt(0); //character array starts at 0
		char thirdLetter = name.charAt(2); //charAt returns the individual letters
		System.out.println(name);
		System.out.println(firstLetter);
		System.out.println(thirdLetter);
		//system.out.println(firstLetter); will print B from String name = "Bart";

		System.out.println("****** contains ******");//contains returns a boolean
		String hello = "Hey Young Girl";
		System.out.println("hello : " + hello);
		boolean hasHello = hello.contains("Hello");
		System.out.println("hasHello : " + hasHello);
		//system will return a false boolean because Hey Young Girl does not have Hello

		System.out.println(" ***** Subtring ******");
		String myString = "You are the one Neo";
		String mySubstring = myString.substring(4, 9); // 7 does not include the seventh letter will only print  "you are"
		System.out.println(mySubstring);
		String myOtherSubstring = myString.substring(8);
		System.out.println(myOtherSubstring);
		System.out.println(myString);

		System.out.println("******* indexOf *******");
		int position = myString.indexOf('N');
		System.out.println(position); //system prints 16 as when N starts




		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

        char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
        String hello1 = new String(helloArray); //"Hello
        String hello2 = new String(helloArray); // anytime you create "new" object are assigned to the same string they are two seperate objects

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1; //hello3 is getting the same reference as hello1
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) { //always use ".equals" instead of == when comparing between two variables
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
		StringMethodsDemo strMethodsDemo = new StringMethodsDemo(); //Reference

		String midPartValue = strMethodsDemo.middlePart("string");
		System.out.println(midPartValue);
		boolean hasDoubleX = strMethodsDemo.repeatX("axxbb");
		System.out.println(hasDoubleX);




	}
}
