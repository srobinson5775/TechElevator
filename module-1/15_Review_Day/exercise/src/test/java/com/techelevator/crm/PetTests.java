package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests {
    @Test
    public void getVaccinations(){
        Pet pet = new Pet("Camila", "Dog");
        pet.setVaccinations(List.of("Vaccine1", "Vaccine2"));
        String vaccinationListOutput = pet.listVaccinations();
        Assert.assertEquals("Vaccine1", "Vaccine2", vaccinationListOutput);
    }
}
