package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {
    @Test
    public void One_LessThan20(){
        //Arrange
        Less20 Less20 = new Less20();

        //Act
        Boolean ExpectedTrue = true;
        Boolean ExpectedFalse = false;

        //Assert
        Assert.assertEquals(true, Less20.isLessThanMultipleOf20(19));
        Assert.assertEquals(false, Less20.isLessThanMultipleOf20(41));
    }
    public void Two_LessThan20(){
        //Arrange
        Less20 Less20 = new Less20();

        //Act
        Boolean expectedTrue = true;
        Boolean expectedFalse = false;

        //Assert
        Assert.assertEquals(true, Less20.isLessThanMultipleOf20(18));
        Assert.assertEquals(false, Less20.isLessThanMultipleOf20(42));
    }


}
