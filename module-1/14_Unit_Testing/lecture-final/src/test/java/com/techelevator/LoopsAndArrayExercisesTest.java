package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class LoopsAndArrayExercisesTest {

    @Test
    public void testMiddleWay(){
       //Arrange
        LoopsAndArrayExercises loopsAndArrayExercises = new LoopsAndArrayExercises();
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] expectedResult = {2, 5};

        //Act
        int[] actualResult = loopsAndArrayExercises.middleWay(a, b);

        //Assert
        Assert.assertArrayEquals(expectedResult, actualResult);


    }
}
