package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FontTimesTest {

    @Test
    public void MoreThanThree(){
        //Arrange
        FrontTimes frontTimes = new FrontTimes();

        //Act
        String expected = "Ton";
        String expected2 = "TonTon";
        String expected3 = "TonTonTon";

        //Assert
        Assert.assertEquals(expected, frontTimes.generateString("Tony", 3));
        Assert.assertEquals(expected2, frontTimes.generateString("Ton", 2));
        Assert.assertEquals(expected3, frontTimes.generateString("Tony", 1));
    }
    @Test
    public void LessThanThree(){
        FrontTimes frontTimes = new FrontTimes();

        String expected = "To";
        String expected2 = "ToTo";
        String expected3 = "ToToTo";

        Assert.assertEquals(expected, frontTimes.generateString("Jo", 3));
        Assert.assertEquals(expected2, frontTimes.generateString("Jo", 2));
        Assert.assertEquals(expected3, frontTimes.generateString("Jo", 1));
    }
}
