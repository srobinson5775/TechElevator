package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTest {

    @Test
    public void CigarsForBoolean_IsWeekend(){
        //Arrange
        CigarParty party = new CigarParty();

        //Act
        boolean expected = true;

        //Assert
        Assert.assertEquals(expected,party.haveParty(40, true));
        Assert.assertEquals(expected, party.haveParty(70, true));

    }
    @Test public void CigarsForBoolean_IsNotWeekend(){
        //Assert
        CigarParty party = new CigarParty();

        //Act
        boolean expectedTResult = true;
        boolean expectedFResult = false;

        //Assert
        Assert.assertEquals(expectedFResult, party.haveParty(40, false));
        Assert.assertEquals(expectedFResult, party.haveParty(60, false));
    }
}
