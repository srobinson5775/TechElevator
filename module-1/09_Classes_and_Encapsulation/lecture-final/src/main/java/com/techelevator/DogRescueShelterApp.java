package com.techelevator;

import java.util.*;

public class DogRescueShelterApp {



    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.println("-------------------------------------------------");
        System.out.print(ANSI_BLUE + "(◕ᴥ◕ʋ) ");
        System.out.println(ANSI_YELLOW +"Dog Rescue Shelter Application - Welcome!    "+ ANSI_RESET);
        System.out.println("=================================================");

        //Kennel - TODO: Move Kennel to its own Kennel class and make List rescuedDogList a property, addDog(), etc.
        List<Dog> rescueDogList = new ArrayList<>();


        //Intake Registration TODO: Move to a class/method
        System.out.println(ANSI_YELLOW +"Step 1 - Intake Process"+ ANSI_RESET);
        boolean isIntake = true;
        while(isIntake) {
            System.out.println("Enter Dog Information: ");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Breed: ");
            String breed = scanner.nextLine();

            System.out.print("Save entry - y/n: ");
            String intakeInput = scanner.nextLine();
            if(intakeInput.equalsIgnoreCase("y")){
                //Create an instance of the Dog class to work with in our code / create a dog object
                Dog doggo = new Dog(name, age, breed);
                rescueDogList.add(doggo);
                System.out.println(doggo.getName() + " was successfully added!");
            }else{
                System.out.println("Request cancelled");
            }

            System.out.print("Register another dog - y/n ");
            intakeInput = scanner.nextLine();
            if (intakeInput.equalsIgnoreCase("n")){
                isIntake = false;
            }
        }



        //Microchipping Process  TODO: Move to a class/method
        System.out.println();
        System.out.println(ANSI_YELLOW +"Step 2 - Microchipping Process"+ ANSI_RESET);
        String microChipInput = "";
        Map<String, Dog> dogsReadyForAdoption = new HashMap<>();  //key, value
        for(Dog rescueDog : rescueDogList){
            System.out.print("Enter microchip Id for " + rescueDog.getName() + ": "); //rescuedDog
            microChipInput = scanner.nextLine();
            rescueDog.setMicroChipId(microChipInput);
            dogsReadyForAdoption.put(microChipInput, rescueDog);
        }



        //Adoption process
        System.out.println();
        System.out.println(ANSI_YELLOW +"Step 3 - Adoption Process"+ ANSI_RESET);
        System.out.print("Owner Name: ");
        String ownerInput = scanner.nextLine();
        System.out.print("Dog Microchip Id: ");
        String dogChipIdInput = scanner.nextLine();

        Dog dog = dogsReadyForAdoption.get(dogChipIdInput);
        Adoption adoption = new Adoption();
        String message = adoption.adoptRescueDog(ownerInput, dog);

        //Process complete
        System.out.println(message);
        System.out.println(dog.getName() + " says " + dog.bark());


        scanner.close();
    }



}
