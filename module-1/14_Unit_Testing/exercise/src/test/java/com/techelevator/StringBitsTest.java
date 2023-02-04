package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {

    @Test

    public void EveryOtherChar(){
        //Arrange
        StringBits stringBits = new StringBits();

        //Act
        String expectedResult ="Hlo";
        String expectedResult2 = "H";
        String expectedResult3 = "Hello";

        //Assert
        Assert.assertEquals(expectedResult, "Hello");
        Assert.assertEquals(expectedResult2,"Hi");
        Assert.assertEquals(expectedResult3, "Heeloleo");

    }
}
