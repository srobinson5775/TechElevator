package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
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
		try (userInput) {
			File inputFile;
			while (true) {
				System.out.println("Enter the file to be searched");
				String path = userInput.nextLine();
				inputFile = new File(path);
				if (!inputFile.exists()) {
					System.out.println(path + " does not exist");
					continue;
				} else if (!inputFile.isFile()) {
					System.out.println(path + "is not a file");
					continue;

				}
				break;
			}
			//check to make sure that its not null or empty .is empty
			System.out.println("Enter search word");
			String searchWord = userInput.nextLine();
			if ((searchWord == null) || (searchWord.isEmpty())) {
				System.out.println("search word is empty");
			}

			System.out.println("Should the search be case sensitive? (Y/N");
			boolean caseSensitive = userInput.nextLine().toLowerCase().equals("Y");

			int lineNumber = 1;
			try (Scanner inputScanner = new Scanner(inputFile.getAbsoluteFile())) {
				while (inputScanner.hasNextLine()) {
					String line = inputScanner.nextLine();
					if (!caseSensitive) {
						if (line.toLowerCase().contains(searchWord.toLowerCase())) {
							System.out.println(lineNumber + ")" + line);
						}
					} else {
						if (line.contains(searchWord)) {
							System.out.println(lineNumber + ")" + line);
						}
					}
					lineNumber += 1;
					//src/main/java/alices_adventures_in_wonderland.txt
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}