package com.techelevator;

public class Adoption {

    public Adoption(){

    }

    public String adoptRescueDog(String owner, Dog rescueDog){
        //Business logic to complete the dog adoption process...
        //Background check on Owner...etc.
        rescueDog.setOwner(owner);
        String adoptionMessage = "Congratulations " + rescueDog.getOwner() +
                "! you are the proud owner of " + rescueDog.getName() +
                " ... a lovable " + rescueDog.getAge() + "year old " + rescueDog.getBreed();
        return adoptionMessage;
    }
}
