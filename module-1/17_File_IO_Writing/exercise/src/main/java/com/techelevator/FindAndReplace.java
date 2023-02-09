package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
        if ((searchWord == null) || (searchWord.isEmpty())) {
            System.out.println("The search word is empty");
            System.exit(0);
        }

        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();
        if ((replacementWord == null) || (replacementWord.isEmpty())) {
            System.out.println("The replacement word is empty");
            System.exit(0);
        }

        File sourceFile;
        System.out.println("What is the source file");
        String sourcePath = userInput.nextLine();
        sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            System.out.println(sourcePath + " does not exist");
            System.exit(0);
        } else if (!sourceFile.isFile()) {
            System.out.println(sourcePath + " is not a file");
            System.exit(0);
        }

        System.out.println("What is the destination file");
        String destinationPath = userInput.nextLine();
        File destinationFile = new File(destinationPath);
//        if (!sourceFile.exists()) {
//            System.out.println(destinationPath + " does not exist");
//            System.exit(0);
//        } else if (!sourceFile.isFile()) {
//            System.out.println(destinationPath + " is not a file");
//            System.exit(0);
//        }
        // File inputFile= new File(sourceFile);
        // File outputFile = new File(destinationFile);
        try (
                Scanner dataInput = new Scanner(sourceFile); //file to read from
                PrintWriter dataOutput = new PrintWriter(destinationFile)) { //file to write from
            while (dataInput.hasNextLine()) {
                String lineOfInput = dataInput.nextLine();

                dataOutput.println(lineOfInput.replaceAll(searchWord, replacementWord));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());


        }
    }
}