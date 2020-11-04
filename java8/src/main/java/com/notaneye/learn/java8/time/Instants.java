package com.notaneye.learn.java8.time;


import com.notaneye.learn.java8.time.ModernDatesAndTimes.Demo;

import java.time.Instant;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;


public class Instants implements Demo {

    private Instant now, inTwoDays, tenSecondsFromNow, sixHoursAgo;


    public void demo() {

        begin("java.time.Instant");
        now = Instant.now();
        System.out.printf("Now (Instant): %s\n", now);
        addAndSubtract();
        comparisons();
        otherOperations();
        finish();
    }


    private void addAndSubtract() {

        section("Add & Subtract");
        // Add
        inTwoDays = now.plus(2, ChronoUnit.DAYS);
        System.out.printf("2 days from now (add TemporalUnit): %s\n", inTwoDays);
        inTwoDays = now.plus(Period.ofDays(2));
        System.out.printf("2 days from now (add TemporalAmount): %s\n", inTwoDays);
        tenSecondsFromNow = now.plusSeconds(10);
        System.out.printf("10 seconds from now (add seconds): %s\n", tenSecondsFromNow);
        tenSecondsFromNow = now.plusMillis(10_000);
        System.out.printf("10 seconds from now (add millis): %s\n", tenSecondsFromNow);

        // Subtract
        sixHoursAgo = now.minus(6, ChronoUnit.HOURS);
        System.out.printf("6 hours ago (subtract TemporalAmount): %s\n", sixHoursAgo);
        // `plus` and `minus` are reflexive -- same variants available
    }


    private void comparisons() {

        section("Comparisons");
        System.out.printf("Now is equal to 2 days from now: %b\n", now.equals(inTwoDays));
        System.out.printf("Now is before 10 seconds from now: %b\n", now.isBefore(tenSecondsFromNow));
        System.out.printf("Now is after 6 hours ago: %b\n", now.isAfter(sixHoursAgo));
        System.out.printf("Compare 6 hours ago with 10 seconds from now: %d\n",
                          sixHoursAgo.compareTo(tenSecondsFromNow));
    }


    private void otherOperations() {

        section("Other Operations");
        long minutesSince6HoursAgo = now.until(sixHoursAgo, ChronoUnit.MINUTES);
        System.out.printf("There are %d minutes since %s\n", -minutesSince6HoursAgo, sixHoursAgo);
        long millisUntil2DaysFromNow = now.until(inTwoDays, ChronoUnit.MILLIS);
        System.out.printf("There are %d milliseconds until %s\n", millisUntil2DaysFromNow, inTwoDays);
        // Notice the ability to chain these, since each method call returns a new instance
        Instant truncateToSecond = now.with(ChronoField.NANO_OF_SECOND, 0).with(ChronoField.MILLI_OF_SECOND, 0);
        System.out.printf("Now truncated to second: %s\n", truncateToSecond);
    }
}
