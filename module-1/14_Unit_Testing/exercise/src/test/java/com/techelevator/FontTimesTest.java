package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FontTimesTest {

    @Test
    public void MoreThanThree(){
        //Arrange
        FrontTimes frontTimes = new FrontTimes();
        String str = "Chocolate";
        int n = 3;
        String expectedStr = "ChoChoCho";

        //Act
        String actualStr = frontTimes.generateString(str,n);

        //Assert
        Assert.assertEquals(expectedStr, actualStr);
    }
    @Test
    public void LessThanThree(){
        FrontTimes frontTimes = new FrontTimes();
        String str = "Chocolate";
        int n = 2;
        String expectedStr = "ChoCho";

        //Act
        String actualStr = frontTimes.generateString(str, n);

        Assert.assertEquals(expectedStr, actualStr);
    }
}
