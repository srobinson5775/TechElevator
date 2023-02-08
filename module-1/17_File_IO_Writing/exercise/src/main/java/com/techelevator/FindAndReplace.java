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
        if ((searchWord == null) || (searchWord.isEmpty())){
            System.out.println("The search word is empty");
            System.exit(1);
        }

        System.out.println("What is the replacement word?");
        String replacementWord = userInput.nextLine();
        if ((replacementWord == null) || (replacementWord.isEmpty())){
            System.out.println("The replacement word is empty");
            System.exit(1);
        }

        File sourceFile;
        System.out.println("What is the source file");
        String path = userInput.nextLine();
        sourceFile = new File(path);
        if (!sourceFile.exists()) {
            System.out.println(path + " does not exist");
            System.exit(1);
        } else if (!sourceFile.isFile()) {
            System.out.println(path + " is not a file");
            System.exit(1);
        }

        File destinationFile;
        System.out.println("What is the destination file?");
        String destinationPath = userInput.nextLine();
        destinationFile = new File(destinationPath);
        if(!destinationFile.exists()) {
            System.out.println(destinationPath + " does not exist");
            System.exit(1);
        } else if (!destinationFile.isFile()){
            System.out.println(destinationPath + " is not a file");
            System.exit(1);
        }

        try(Scanner sourceScanner = new Scanner(sourceFile.getAbsoluteFile())) {
            PrintWriter destinationWriter = new PrintWriter(destinationFile.getAbsoluteFile());
                while (sourceScanner.hasNextLine()){
                    String line = sourceScanner.nextLine();
                    destinationWriter.println(line.replaceAll(searchWord, replacementWord));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}
