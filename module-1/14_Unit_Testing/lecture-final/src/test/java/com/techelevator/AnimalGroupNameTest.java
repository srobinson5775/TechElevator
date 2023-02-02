package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTest {

    @Test
    public void ProvideKnownAnimalName_ExpectKnownHerdName(){
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String animalName = "giraffe";
        String expectedHerdName = "Tower";

        // Act
        String actualHerdName = animalGroupName.findHerd(animalName);

        //Assert
        Assert.assertEquals(expectedHerdName, actualHerdName);

    }

    @Test
    public void ProvideKnownAnimalName_MixedCase_ExpectKnownHerdName(){
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String animalName = "giRAffE";
        String expectedHerdName = "Tower";

        // Act
        String actualHerdName = animalGroupName.findHerd(animalName);

        //Assert
        Assert.assertEquals(expectedHerdName, actualHerdName);

    }

    @Test
    public void ProvideUnknownAnimalName_ExpectUknownHerdName(){
        //Arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();
        String animalNameEmptyString = "";
        String animalNameNotPresent = "elephants";

        String expectedHerdName = "unknown";


        // Act
        String actualHerdName = animalGroupName.findHerd(animalNameEmptyString);
        String actualHerdName2 = animalGroupName.findHerd(animalNameNotPresent);

        //Assert
        Assert.assertEquals("ERROR: Please verify the return value: ", expectedHerdName, actualHerdName);
        Assert.assertEquals("ERROR: Please verify the return value: ",expectedHerdName, actualHerdName2);


    }
}
