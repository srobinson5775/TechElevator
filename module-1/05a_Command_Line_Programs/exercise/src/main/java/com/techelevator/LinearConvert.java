package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Is Measurement in (M)eters or (F)eet?: ");
		String measureType = scanner.nextLine();

		System.out.println("Please Enter Measurement: ");
		int measurements = Integer.parseInt(scanner.nextLine());

		String M = measureType;
		if (measureType == M) {
			M = String.valueOf((measurements * 0.3048));
			System.out.println(measurements +"m is " + M + "f");
		}
		else if (measureType != M) {
			M = String.valueOf((measurements * 3.2808399));
			System.out.println(measurements + "f is " + M + "m");
		}

	}

}
