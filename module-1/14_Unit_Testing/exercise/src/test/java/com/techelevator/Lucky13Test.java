package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {

    @Test
    public void ArrayContains_No1Or3(){
        //Arrange
        Lucky13 lucky13 = new Lucky13();

        //Act
        Boolean expected = true;
        //Assert

        Assert.assertEquals(expected, lucky13.getLucky(new int[]{0, 2, 4}));
    }

    @Test
    public void ArrayContains_1And3(){
        //Arrange
        Lucky13 lucky13 = new Lucky13();

        //Act
        Boolean expected = false;

        //Assert

        Assert.assertEquals(expected, lucky13.getLucky(new int[]{1, 3, 1}));
    }
}
