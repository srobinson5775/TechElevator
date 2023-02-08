package com.techelevator;

public class StringFormatExample {

    public static void main(String[] args) {

        String name = "Neo";
        String day = "Wednesday";
        int messageCount = 5;

        String msg = name + ", "+ day + " you have " + messageCount + " messages.";
        System.out.println(msg);

        String msgUsingFormat = String.format("%s, %s you have %d messages.", name, day, messageCount);
        System.out.println(msgUsingFormat);

    }
}
