package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {

    @Test

    public void PartialConecatnation(){
        //Arrange
        NonStart nonStart = new NonStart();

        //Act
        String expectedResult = "ellohere";
        String expectedResult2 = "avacode";
        String expectedResult3 = "hotlava";

        //Assert
        Assert.assertEquals(expectedResult,nonStart.getPartialString("Hello", "There"));
        Assert.assertEquals(expectedResult2, nonStart.getPartialString("Java", "Code"));
        Assert.assertEquals(expectedResult3, nonStart.getPartialString("Shotl", "hotlava"));
    }
    @Test

    public void StringIsNull(){
        //Arrange
        NonStart nonStart = new NonStart();

        //Act
        String expectedResult = "ellohere";
        String expectedResult2 = "avacode";
        String expectedResult3 = "hotlava";

        //Assert
        Assert.assertEquals(expectedResult, nonStart.getPartialString(null, null));
        Assert.assertEquals(expectedResult2, nonStart.getPartialString(null, null));
        Assert.assertEquals(expectedResult3, nonStart.getPartialString(null, null));
    }
}
