package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

    @Test
    public void CigarsForBoolean_IsWeekend(){
        //Arrange
        CigarParty cigarParty = new CigarParty();

        boolean expectedResult = true;
        boolean expectedResult2 = true;
        boolean expectedResult3 = false;
        int minCigars = 40;
        int maxCigars = 70;


        //Act
        boolean actualResult = cigarParty.haveParty(minCigars, true );
        boolean actualResult2 = cigarParty.haveParty(maxCigars, true);
        boolean actualResult3 = cigarParty.haveParty(30, false);
        //Assert
        Assert.assertEquals(expectedResult, actualResult);
        Assert.assertEquals(expectedResult2,actualResult2);
        Assert.assertEquals(expectedResult3, actualResult3);

    }
    @Test public void CigarsForBoolean_IsNotWeekend(){
        //Assert
        CigarParty cigarParty = new CigarParty();
        boolean expectedResult = true;
        boolean expectedResult2 = false;
        int minCigars = 40;
        int maxCigars = 70;

        //Act
        boolean actualResult = cigarParty.haveParty(minCigars, true);
        boolean actualResult2 = cigarParty.haveParty(maxCigars, false);


        //Assert
        Assert.assertEquals(expectedResult, actualResult);
        Assert.assertEquals(expectedResult2, actualResult2);
    }
}
