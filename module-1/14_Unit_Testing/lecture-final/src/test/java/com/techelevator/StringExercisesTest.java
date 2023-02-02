package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringExercisesTest {

    @Test
    public void testFirstTwo(){
        //1. Arrange
        StringExercises stringExercises = new StringExercises();
        String expected = "He";  // For str value param "Hello"
        String providedValue = "Hello";

        //2. Act
        String actual = stringExercises.firstTwo(providedValue);

        //3. Assert
        Assert.assertEquals(expected, actual);


    }
}
