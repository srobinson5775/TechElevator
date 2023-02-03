package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringExercisesTest {

    @Test
    public void testFirstTwo(){
        //1. Arrange setting the values arranging the test
        StringExercises stringExercises = new StringExercises();
        String expected = "He"; // For str value param "Hello"
        String providedValue = "Hello";

        //2. Act declare a string that represents the actual value and calling the method with the actual value
        String actual = stringExercises.firstTwo(providedValue);

        //3. Assert expected value is the same as the actual value, either true or false
        Assert.assertEquals(expected, actual);


    }
}
