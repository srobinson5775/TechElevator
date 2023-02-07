package com.techelevator;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args)  {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */

		System.out.println("Enter the path of a file or directory");
		String path = userInput.nextLine();
		File fileObj = new File(path); //using path takes whatever is put in the console

		//Inspecting the file system
		System.out.println();
		//checks if file exists
		if(fileObj.exists()){
			System.out.println("name: " + fileObj.getName());
			System.out.println("absolutePath: " + fileObj.getAbsolutePath());

			if(fileObj.isDirectory()){
				System.out.println("type: directory");//check to see if its a directory it is inside the first file exsists
			} else if (fileObj.isFile()){
				System.out.println("type: file");
			}
		} else {
			System.out.println("file does not exist.");
		}


		//creating a directory

		System.out.println();
		System.out.println("Creating a new directory");
		System.out.println("Enter the path of the new directory");
		path = userInput.nextLine();
		File newDirectory = new File(path);

		if(newDirectory.exists()){
			System.out.println("Sorry, " + newDirectory.getAbsolutePath() + " already exisits.");
		} else {
			if(newDirectory.mkdir()){
				System.out.println("New directory created at " + newDirectory.getAbsolutePath());
			} else {
				System.out.println("Could not create directory");

			}
		}


		//creating a file
		System.out.println();
		System.out.println("Put a file into the directory");
		System.out.println("Enter name for the new file >>> ");
		String fileName = userInput.nextLine();
		File newFile = new File(newDirectory, fileName);

		try {
			newFile.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("name: " + newFile.getName());
		System.out.println("absolutePath: " + newFile.getAbsolutePath());
		System.out.println("size : " + newFile.length());

		//writing to a file

		System.out.println();
		System.out.println("Writing content in the new file");
		System.out.println("Enter a message to be stored in the new file >>>");
		String message = userInput.nextLine();

		try(PrintWriter writer = new PrintWriter(newFile)){
			writer.println(message);
		} catch (FileNotFoundException e) {
			System.out.println(e.getCause());
		}

		System.out.println();
		System.out.println("name: " + newFile.getName());
		System.out.println("absolutePath: " + newFile.getAbsolutePath());
		System.out.println("size : " + newFile.length());

		//appending to a file

		String newMessage ="\nAppreciate\nElevate\nParticipate";
		boolean append = newFile.exists() ? true : false;
//		//same as line above. that is ternary expression
//		if(newFile.exists()){
//			append = true;
//		} else {
//			append = false;
//		}

		try(PrintWriter writer = new PrintWriter(new FileOutputStream(newFile, append))){
			writer.println(newMessage);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}


}
