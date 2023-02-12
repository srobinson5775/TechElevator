package com.techelevator;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateAndTimeExamples {

    public static void main(String[] args) {

        String nowAsString = DateAndTimeUtils.getCurrentTimeAsString(DateAndTimeUtils.FORMAT_1);

        System.out.println("Current time as string:");
        System.out.println(nowAsString);


        String sampleDateString = "12/15/2022 13:15";
        LocalDateTime parsedSampleDate = DateAndTimeUtils.getStringAsDateTime(sampleDateString,
                DateAndTimeUtils.FORMAT_1);
        System.out.println();
        System.out.println("sampleDateString as LocalDateTime:");
        System.out.println(parsedSampleDate.toString());

        String parsedSampleDateAsString = DateAndTimeUtils.getLocalDateTimeAsString(parsedSampleDate,
                DateAndTimeUtils.FORMAT_2);
        System.out.println();
        System.out.println("parsedSampleDate as different String format:");
        System.out.println(parsedSampleDateAsString);

        LocalDateTime minusThreeDays = parsedSampleDate.minusDays(3);
        System.out.println();
        System.out.println("parsedSampleDate minus 3 days:");
        System.out.println(minusThreeDays.toString());

        LocalDateTime plusTwoYears = parsedSampleDate.plusYears(2);
        System.out.println();
        System.out.println("parsedSampleDate plus 2 years:");
        System.out.println(plusTwoYears);

        System.out.println();
        System.out.println("Comparing minusThreeDays and parsedSampleDate:");
        if (minusThreeDays.compareTo(parsedSampleDate) > 0) {
            System.out.println("minusThreeDays is greater than parsedSampleDate");
        } else if (minusThreeDays.compareTo(parsedSampleDate) < 0) {
            System.out.println("minusThreeDays is less than parsedSampleDate");
        } else {
            System.out.println("minusThreeDays is equals than parsedSampleDate");
        }


        // LocalData has a parse method - use yyyy-MM-dd format)
        LocalDate parsedDate = LocalDate.parse("2022-01-01");

        System.out.println();
        System.out.println("parsedDate as String");
        System.out.println(DateAndTimeUtils.getLocalDateAsString(parsedDate, DateAndTimeUtils.BIRTHDATE_FORMAT));


    }
}
