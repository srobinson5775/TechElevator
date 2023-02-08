package com.techelevator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindAndReplace {

    // Use this scanner for all user input. Don't create additional Scanners with System.in
    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        FindAndReplace findAndReplace = new FindAndReplace();
        findAndReplace.run();
    }

    public void run() {
        /* Your code goes here */
        System.out.println("what is the search word?");
        String searchWord = userInput.nextLine();

        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();


        System.out.println("What is the source file");
        String pathToSource = userInput.nextLine();


        System.out.println("What is the destination file?");
        String pathToDestination = userInput.nextLine();

    }
}
