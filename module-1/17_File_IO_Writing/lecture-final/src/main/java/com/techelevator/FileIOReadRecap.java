package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 *
 * Write a program that, given a  path for a text file, reads the contents of the file,
 * and displays both the number of words and the number of sentences in the file.
 *
 * Hint 1: words are delimited by space characters
 * Hint 2: sentences are terminated by either a period, an exclamation mark, or a question mark.
 *
 * alices_adventures_in_wonderland.txt
 * -----------------------------------
 * Expected Word Count: 30355
 * Expected Sentence Count: 1116
 */

public class FileIOReadRecap {

    // Use this scanner for all user input. Don't create additional Scanners with System.in
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        FileIOReadRecap fileIOReadRecap = new FileIOReadRecap();
        try {
            fileIOReadRecap.run();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }


    }


    public void run() throws FileNotFoundException {
        /* Your code goes here */
        try (userInput) {
            // Get the path of the input file
            File inputFile;
            while (true) {
                System.out.println("What is the file that should be searched?");
                String path = userInput.nextLine();
                // Validate the input file
                inputFile = new File(path);
                if (!inputFile.exists()) {
                    System.out.println(path + " does not exist");
                    continue;
                } else if (!inputFile.isFile()) {
                    System.out.println(path + " is not a file");
                    continue;
                }
                break;
            }
            // Count the words and sentences
            int wordCount = 0;
            int sentenceCount = 0;
            try (Scanner inputScanner = new Scanner(inputFile.getAbsoluteFile())) {
                while (inputScanner.hasNextLine()) {
                    String line = inputScanner.nextLine();
                    if (!line.isEmpty()) {                                // Blank lines should be skipped
                        String[] words = line.trim().split("\\s+");    // Split the line into individual words.
                        wordCount += words.length;                        // The length of the array of words is the number of words.
                        for (String word : words) {                        // Loop through words, add one each 'sentence terminated' word found
                            if (word.endsWith(".") || word.endsWith("?") || word.endsWith("!")) {
                                sentenceCount += 1;
                            }
                        }
                    }
                    else throw new FileNotFoundException("Message");
                }
            } //catch (FileNotFoundException e) {
//                System.out.println(e.getMessage());
//             }
            // Display the word and sentence counts
            System.out.println("Word count: " + wordCount);
            System.out.println("Sentence count: " + sentenceCount);
        }

    }


}
