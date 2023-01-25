package com.techelevator;

public class StringMethodsDemo {

    /*
     Given a string of even length, return a string made of the middle two chars, so the string "string"
     yields "ri". The string length will be at least 2.
     middlePart("string") → "ri"
     middlePart("code") → "od"
     middlePart("Practice") → "ct"
     */
    public String middlePart(String str) {
        String result;
        int len = str.length(); //naming the variable len the entire length of whats being passed in
        result = str.substring(len / 2 - 1, len /2 + 1);



        return result;
    }



    /*
	 Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
	 repeatX("axxbb") → true
	 repeatX("axaxax") → false
	 repeatX("xxxxx") → true
	 */
    public boolean repeatX(String str) {
        boolean result = false; //set result to false right off the bat
        int firstX = str.indexOf('x'); // gonna find the first value of x as a int
        if (firstX < str.length() - 1); {
            result = str.charAt(firstX +1) == 'x';
        }



       return result;
    }



    /*
	 Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
	 stringParts("Hello") → "Hlo"
	 stringParts("Hi") → "H"
	 stringParts("Heeololeo") → "Hello"
	 */
    public String stringParts(String str) {
       return null;
    }
}
