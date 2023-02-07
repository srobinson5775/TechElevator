package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class WordSearch {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		WordSearch wordSearch = new WordSearch();
		wordSearch.run();
	}

	public void run() {
		/* Your code goes here */
		//Shaylyn start here
		System.out.println("Enter the Name of the file");
		String filePath = userInput.nextLine();
		File wordSearchFile = new File(filePath);


	}

}
