package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {

    @Test

    public void PartialConcatnation(){
        //Arrange
        NonStart nonStart = new NonStart();

        String a = "Hello";
        String b = "There";
        String expectedString = "ellohere";

        //Act
        String actutalString = nonStart.getPartialString(a, b);


        //Assert
        Assert.assertEquals(expectedString, actutalString);

    }
    @Test

    public void StringIsNull(){
        //Arrange
        NonStart nonStart = new NonStart();

        String a = null;
        String b = null;
        String expectedString = "";
        //Act
        String actualString= nonStart.getPartialString(a, b);


        //Assert
        Assert.assertEquals(expectedString, actualString);
    }
}
