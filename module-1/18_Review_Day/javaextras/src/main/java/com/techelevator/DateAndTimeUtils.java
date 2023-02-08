package com.techelevator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeUtils {

    /*
        Details of DateTimeFormatter pattern characters:

        https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html
     */

    public static final String FORMAT_1 = "MM/dd/yyyy HH:mm";
    public static final String FORMAT_2 = "MM/dd/yyyy HH:mm:ss";
    public static final String BIRTHDATE_FORMAT = "MM/dd/yyyy";

    public static String getCurrentTimeAsString(String format) {
        // LocalDateTime provides a static now() method to get current date/time
        LocalDateTime now = LocalDateTime.now();

        // Create a DateTimeFormatter using a format String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        // format the LocalDateTime into a String
        return formatter.format(now);
    }

    public static LocalDateTime getStringAsDateTime(String dateTimeString, String format) {
        // Create a DateTimeFormatter using a format String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        // Use the LocalDateTime parse method to parse a String into a LocalDateTime
        // using the specified format
        return LocalDateTime.parse(dateTimeString, formatter);
    }

    public static String getLocalDateTimeAsString(LocalDateTime dateTime, String format) {
        // Create a DateTimeFormatter using a format String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        // format the LocalDateTime as into a String
        return formatter.format(dateTime);
    }

    public static String getLocalDateAsString(LocalDate date, String format) {
        // Create a DateTimeFormatter using a format String
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        // format the LocalDate as into a String
        return formatter.format(date);
    }


}
