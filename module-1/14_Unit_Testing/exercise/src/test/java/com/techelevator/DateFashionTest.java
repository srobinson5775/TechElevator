package com.techelevator;

import org.junit.Test;
import org.junit.Assert;
public class DateFashionTest {

    @Test
    public void IfNotStylish_DontGetTable(){
        //Arrange
        int YouStyle = 0;
        int DateStyle = 0;
        DateFashion getATable = new DateFashion();
        //Act
        int expected = 0;

        //Assert
        Assert.assertEquals(0, getATable.getATable(2,2));
        }

    @ Test
    public void BothAreStylish_MightGetTable(){
        DateFashion getATable = new DateFashion();

        int expected = 1;

        Assert.assertEquals(expected, getATable.getATable(3, 3));

    }
    @Test
    public void EitherIsStylish_WillGetTable(){
        DateFashion getATable = new DateFashion();

        int expected = 2;

        Assert.assertEquals(expected, getATable.getATable(8, 3));
    }
    }



