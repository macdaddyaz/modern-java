package com.notaneye.learn.java8.time;


import com.notaneye.learn.java8.time.ModernDatesAndTimes.Demo;

import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class PeriodsAndDurations implements Demo {

    public void demo() {

        begin("Periods and Durations");
        periods();
        durations();
    }


    private void periods() {

        section("java.time.Period");
        ZoneId chicago = ZoneId.of("America/Chicago");
        final ZonedDateTime beforeDst = ZonedDateTime.of(2020, 3, 7, 14, 13, 12, 11, chicago);
        final Period threeDays = Period.ofDays(3);
        final ZonedDateTime afterDst = beforeDst.plus(threeDays);
        System.out.printf("Before DST:   %s\n", beforeDst);
        System.out.printf("3 days later: %s\n", afterDst);
        // Notice that the local time is "conceptually" 3 days later, despite crossing the DST boundary
    }


    private void durations() {

        section("java.time.Duration");
        ZoneId chicago = ZoneId.of("America/Chicago");
        final ZonedDateTime beforeDst = ZonedDateTime.of(2020, 3, 7, 14, 13, 12, 11, chicago);
        final Duration threeDays = Duration.ofDays(3);
        final ZonedDateTime afterDst = beforeDst.plus(threeDays);
        System.out.printf("Before DST:   %s\n", beforeDst);
        System.out.printf("3 days later: %s\n", afterDst);
        // Notice that the local time is exactly 72 hours later, appearing to "lose" an hour due to DST
    }
}
