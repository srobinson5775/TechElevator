package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.

		 */

			int numberOfExercises;
			numberOfExercises = 26;


			System.out.println(numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.

		*/

		double half = 0.5;

		System.out.println(half);




		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/

		String name = "TechElevator";

		System.out.println(name);



		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/

		int seasonsOfFirefly = 1;
		System.out.println(seasonsOfFirefly);


		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/

		String myFavoriteLanguage = "Java";
		System.out.println(myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/

		float pi = 3.1416f;
		System.out.println(pi);

		/*
		7. Create and set a variable that holds your name.
		*/

		String myName = "My Name";

		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		int numberOfButtons = 5;


		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		double phoneBatteryActual = .8527213;
		int phoneBatteryDisplay = 85;
		/*


		10. Create an int variable that holds the difference between 121 and 27.
		*/

		int bonus = 4;
		int difference = (121 - 27) + bonus;


		System.out.println(difference);

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/

		double sum = 12.3 + 32.1;
		System.out.println(sum);

		/*
		12. Create a String that holds your full name.
		*/

		String fullName = "Tony Stark";


		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/

		String greeting = "Hello, " + fullName;
		System.out.println(greeting);


		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
		fullName = fullName + " Esquire";

		System.out.println(fullName);

		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		fullName += " Esquire";

		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/

		String movieTitle = "Saw";
		int version = 2;
		//movieTitle = movieTitle + version;
		movieTitle += version;

		System.out.println(movieTitle);

		/*


		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		movieTitle += 0;
		//movieTitle += "00"; //Quotes are needed if there's more than one zero.

		System.out.println(movieTitle);
		/*


		18. What is 4.4 divided by 2.2?
		*/
		System.out.println(4.4 / 2.2);


		/*
		19. What is 5.4 divided by 2?
		*/
		System.out.println(5.4/2);


		/*
		20. What is 5 divided by 2?
		*/
		System.out.println(5/2);


		/*
		21. What is 5.0 divided by 2?
		*/

		System.out.println(5.0/2);

		/*
		22. What is 33.3 divided by 100? Is the answer you get right or wrong?
		*/
			System.out.println(33.3/100);

		/*
		23. If I divide 5 by 2, what's my remainder?
		*/

		System.out.println(5 % 2);

		/*
		24. What is 1,000,000,000 * 3?
		*/

		long billion = 1000000000;
		//long billion = 1_000_000_000;  //can use "_" separators with numbers for readability
		long threeBillion = billion * 3;
		System.out.println(threeBillion);





		/*
		25. Create a variable that holds a boolean called isDoneWithExercises and
		set it to false.
		*/

		boolean isDoneWithExercises = false;


		/*
		26. Now set isDoneWithExercise to true.
		*/

		isDoneWithExercises = true;



		//Extra

		//Casting explicitly
		double costOfItem = 2.00d;
		double numberPur = .27d;
		//System.out.println(costOfItem/numberPur);
		int result = (int) (costOfItem / numberPur);
		System.out.println((result));


		//Module1-2 Exercise Sandbox
		 /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsInTheWoods = 3;
		int raccoonsWhoGoHome = 2;
		int remainingRaccoons = raccoonsInTheWoods - raccoonsWhoGoHome;

		System.out.println(remainingRaccoons);
		
	}

}
