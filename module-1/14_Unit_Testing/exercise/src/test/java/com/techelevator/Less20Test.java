package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {
    @Test
    public void One_LessThan20(){
        //Arrange
        Less20 Less20 = new Less20();

        //Act
        Boolean expectedTrue = true;
        Boolean expectedFalse = false;
        Boolean actualTrue = Less20.isLessThanMultipleOf20(19);
        Boolean actualFalse = Less20.isLessThanMultipleOf20(41);

        //Assert
        Assert.assertEquals(expectedTrue, actualTrue);
        Assert.assertEquals(expectedFalse, actualFalse);
    }
    @Test
    public void Two_LessThan20(){
        //Arrange
        Less20 Less20 = new Less20();

        //Act
        Boolean expectedTrue = true;
        Boolean expectedFalse = false;
        Boolean actualTrue = Less20.isLessThanMultipleOf20(18);
        Boolean actualfalse = Less20.isLessThanMultipleOf20(42);

        //Assert
        Assert.assertEquals(expectedTrue, actualTrue);
        Assert.assertEquals(expectedFalse, actualfalse);
    }


}
