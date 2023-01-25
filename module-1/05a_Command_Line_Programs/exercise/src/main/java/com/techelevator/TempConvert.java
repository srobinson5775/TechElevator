package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter the temperature: ");
		int temperature = Integer.parseInt(scanner.nextLine());

		System.out.println("Is temperature (C)Celsius or (F)Fahrenheit ?");
		String degreeType = scanner.nextLine();

		String C = degreeType;
		if (degreeType == C){
			C = String.valueOf((temperature -32)/ 1.8);
			System.out.println( temperature +"C is " + C + "F");
		}
		else if (degreeType != C) {
			C = String.valueOf((temperature * 1.8) + 32);
			System.out.println(temperature + "F is " + C + "C");
		}

}}
