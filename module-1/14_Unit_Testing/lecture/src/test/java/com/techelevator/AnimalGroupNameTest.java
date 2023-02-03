package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTest {

    @Test
    public void ProvideKnownAnimalName_ExpectKnownHerdName(){
        //Arrange happy path
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String animalName = "giraffe";
        String expectedHerdName = "Tower";

        //Act
        String actualHerdName = animalGroupName.findHerd(animalName);

        //Assert expected first then actual
        Assert.assertEquals(expectedHerdName, actualHerdName);
    }



    @Test
    public void ProvideKnownAnimalName_MixedCase_ExpectKnownHerdName(){
        //Arrange and act are the same variable is different
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String animalName = "giRAffE";
        String expectedHerdName = "Tower";

        //Act
        String actualHerdName = animalGroupName.findHerd(animalName);

        //Assert expected first then actual
        Assert.assertEquals(expectedHerdName, actualHerdName);


    }


    @Test
    public void ProvideUnknownAnimalName_ExpectUnknownHerdName(){
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        //two different scenarios if blank or if mispelled and doesnt match key
        String animalName = "";
        String animalName2 = "elephants";


        String expectedHerdName = "unknown";

        //Act
        String actualHerdName = animalGroupName.findHerd(animalName);
        String actualHerdName2 = animalGroupName.findHerd(animalName2);

        //Assert expected first then actual
        Assert.assertEquals("ERROR: Please verify the return value", expectedHerdName, actualHerdName);
        Assert.assertEquals(expectedHerdName, actualHerdName2);
    }
}
