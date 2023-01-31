package com.techelevator;

public class ExampleMethods {

    private final static char SMALL_TSHIRT = 'S';
    private final static char MEDIUM_TSHIRT = 'M';
    private final static char LARGE_TSHIRT = 'L';

    /*
     Given a string of even length, return a string made of the middle two chars, so the string "string"
     yields "ri". The string length will be at least 2.
     middlePart("string") → "ri"
     middlePart("code") → "od"
     middlePart("Practice") → "ct"
     */
    public String middlePart(String str) {
        String result;
        int len = str.length(); //get the length use it in our substring to determine our begin index and end index
        result = str.substring(len / 2 - 1, len / 2 + 1); //len / 2 gives us the exact middle reference for an even string

        return result;
    }



    /*
	 Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
	 repeatX("axxbb") → true
	 repeatX("axaxax") → false
	 repeatX("xxxxx") → true
	 */
    public boolean repeatX(String str) {
       boolean result = false;
       int firstX = str.indexOf('x'); // use indexOf to provide the index of the first occurrence of x
       if (firstX < str.length() - 1){ // if x is not equal to the last character (means it's index < length() -1
           result = str.charAt(firstX + 1) == 'x'; //set result = to the boolean expression is the character at the index of firstX + 1 also = 'x'
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
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result += str.charAt(i);
            }
        }
        return result;
    }


    /*
    Another customer called in and is hosting a large networking event and
    needs a bulk order. Rather than indicate how many of each shirt they
    wanted, they've asked for as even distribution as possible.

    Implement the logic to generate an order representing as even a distribution
    as possible, for example: ('S', 'M', 'L', 'S', 'M', 'L', 'S', ...)

    Note: The number of shirts ordered is guaranteed to be non-negative.

    Examples:
    buildBulkOrder(6) → ['S', 'M', 'L', 'S', 'M', 'L']
    buildBulkOrder(3) → ['S', 'M', 'L']
    buildBulkOrder(4) → ['S', 'M', 'L', 'S']
    buildBulkOrder(0) → []
     */
    public char[] buildBulkOrder(int numberOfShirts) {
        char[] order = new char[numberOfShirts];
        for (int i = 0; i < order.length; i++) {
            int size = i % 3;
            if (size == 0) {
                order[i] = SMALL_TSHIRT;
            }
            else if (size == 1) {
                order[i] = MEDIUM_TSHIRT;
            }
            else {
                order[i] = LARGE_TSHIRT;
            }
        }
        return order;
    }
}
