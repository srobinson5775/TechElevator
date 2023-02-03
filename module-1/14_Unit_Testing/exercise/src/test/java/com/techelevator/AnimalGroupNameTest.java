package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTest {

@Test
    public void ProvideAnimalName_ExpectHerdName(){
    AnimalGroupName animalGroupName = new AnimalGroupName();
    String animalName = "rhino";
    String expectedHerdName = "Crash";

    String actualHerdName = animalGroupName.getHerd(animalName);

    Assert.assertEquals(expectedHerdName, actualHerdName);
}

@Test
    public void ProvideAnimalMixedCase_ExpectHerdName(){
    AnimalGroupName animalGroupName = new AnimalGroupName();
    String animalName = "RhinO";
    String expectedHerdName = "Crash";

    String actualHerdName = animalGroupName.getHerd(animalName);

    Assert.assertEquals(expectedHerdName, actualHerdName);
}
@Test
    public void NullOrMispelledAnimalName_ExpectedHerdName(){
    AnimalGroupName animalGroupName = new AnimalGroupName();
    String animalName = "Ronin";
    String animalName2 = null;
    String animalName3 = "";

    String expectedHerdName = "unknown";

    String actualHerdName = animalGroupName.getHerd(animalName);
    String actualHerdName2 = animalGroupName.getHerd(animalName2);
    String actualHerdName3 = animalGroupName.getHerd(animalName3);

    Assert.assertEquals(expectedHerdName,actualHerdName);
    Assert.assertEquals(expectedHerdName, actualHerdName2);
    Assert.assertEquals(expectedHerdName, actualHerdName3);
}
}
