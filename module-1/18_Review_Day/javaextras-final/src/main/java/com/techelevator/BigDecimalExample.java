package com.techelevator;

import java.math.BigDecimal;

public class BigDecimalExample {

    public static void main(String[] args) {
        double d1 = 3.47;
        double d2 = 3.17;
        // prints 0.30000000000000027
        System.out.println(d1 - d2);


        BigDecimal a = new BigDecimal("0.98765432109876543210987654321");
        BigDecimal b = new BigDecimal("0.4");

        BigDecimal c = new BigDecimal(81);
        BigDecimal d = new BigDecimal(2);


        //Mathematical operations with BigDecimal (+, -, *, /, %)

        BigDecimal sum = a.add(b);
        BigDecimal diff = a.subtract(b);
        BigDecimal prod = a.multiply(b);
        BigDecimal quo = a.divide(b);

        BigDecimal mod = c.remainder(d);

        System.out.println("sum " + sum);
        System.out.println("diff " + diff);
        System.out.println("prod " + prod);
        System.out.println("quo " + quo);
        System.out.println("mod " + mod);


        //Equality and inequality with BigDecimal - Relational operators (==, >, >=, <, <= ) use compareTo()
        BigDecimal b1 = new BigDecimal("100.5");
        BigDecimal b2 = new BigDecimal("100.4");
        BigDecimal b3 = new BigDecimal("100.4");

        System.out.println(b1.compareTo(b2)); // 1
        System.out.println(b2.compareTo(b1)); // -1
        System.out.println(b2.compareTo(b3)); // 0

        /*
        As illustrated in the preceding code, compareTo() returns one of three possible values:

        -1 if the calling object is less than the parameter object.
        0 if the calling object and parameter object are equal.
        1 if the calling object is greater than the parameter object.

         */
    }

}
