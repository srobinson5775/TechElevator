package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Pet(String name, String species){
        this.name = name;
        this.species = species;
    }

    public String listVaccinations(){
        String allVaccinations ="";
        for (int i = 0; i < vaccinations.size(); i++){
            if(i != vaccinations.size()-1){
                allVaccinations += vaccinations.get(i) + ",";

            } else {
                allVaccinations += vaccinations.get(i);
            }


        }

        return allVaccinations;
    }

}
