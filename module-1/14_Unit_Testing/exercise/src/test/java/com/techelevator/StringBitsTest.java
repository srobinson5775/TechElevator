package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {

    @Test

    public void EveryOtherChar(){
        //Arrange
        StringBits stringBits = new StringBits();
        String str ="Hello";

        String expectedStr = "Hlo";

        //Act
        String actualStr = stringBits.getBits(str);

        //Assert
        Assert.assertEquals(expectedStr,actualStr);

    }

    @Test

    public void StringIsEmpty_OrNull(){
        StringBits stringBits = new StringBits();
        //Arrange
        String str2 = null;

        String expectedStr2 = "";
        //Act

        String actualStr2 = stringBits.getBits(str2);

        //Assert

        Assert.assertEquals(expectedStr2, actualStr2);


    }
}
