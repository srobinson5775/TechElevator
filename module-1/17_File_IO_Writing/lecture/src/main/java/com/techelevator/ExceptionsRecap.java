package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsRecap {

    public static void main(String[] args) {

        String path = "src/main/java/com/techelevator/data/alices_adventures_in_wonderland.txt";
        File inputFile = new File(path);

        try (Scanner dataInput = new Scanner(inputFile)) {
            while(dataInput.hasNextLine()) {
                String lineOfInput = dataInput.nextLine();
                if(lineOfInput.length() >= 75){
                    System.out.println(lineOfInput.substring(0, 20) + "...");
                }

            }
            //int x = (10 / 0); //simulating divide by zero error
        } catch (FileNotFoundException e) {
            System.err.println("The file does not exist.");
        } catch (ArithmeticException e) {
            System.err.println("Divide by zero is not allowed. " + e.getMessage());
        } finally{
            System.out.println("Program execution has completed...clean up.");

        }


    }
}
