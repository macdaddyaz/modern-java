package com.notaneye.learn.java8.time;


import com.notaneye.learn.java8.time.ModernDatesAndTimes.Demo;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;


public class TimeZonesAndOffsets implements Demo {

    final private ZoneId system = ZoneId.systemDefault();
    final private ZoneId singapore = ZoneId.of("Asia/Singapore");
    final private ZoneId gmtMinus8 = ZoneId.of("GMT-8");


    @Override
    public void demo() {

        begin("Time Zones and Offsets");
        timeZones();
        zonedDateTime();
        offsetDateTime();
    }


    public void timeZones() {

        System.out.println("----- Time Zones (Zone IDs) -----");
        System.out.printf("System time zone: %s (%s)\n",
                          system,
                          system.getRules().isFixedOffset() ? "fixed" : "variable");
        System.out.printf("%s: %s (%s)\n",
                          singapore.getId(),
                          singapore.getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()),
                          singapore.getRules().isFixedOffset() ? "fixed" : "variable");
        System.out.printf("%s: %s (%s)\n",
                          gmtMinus8.getId(),
                          gmtMinus8.getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()),
                          gmtMinus8.getRules().isFixedOffset() ? "fixed" : "variable");
    }


    public void zonedDateTime() {

        System.out.println("----- java.time.ZonedDateTime -----");
        ZonedDateTime nowButInSingapore = ZonedDateTime.now(singapore);
        System.out.printf("In Singapore, the time is %s\n", nowButInSingapore);
        System.out.printf("But here, it's %s\n", nowButInSingapore.withZoneSameInstant(system));
    }


    public void offsetDateTime() {

        System.out.println("----- java.time.OffsetDateTime -----");
        ZonedDateTime now = ZonedDateTime.now();
        // Moving east, we must add time
        ZoneOffset fiveHoursEast = hoursFrom(now.getOffset(), 5);
        OffsetDateTime nowBut5HoursEast = now.toOffsetDateTime().withOffsetSameInstant(fiveHoursEast);
        System.out.printf("5 hours east of here it is %s\n", nowBut5HoursEast);
        // Moving west, we must subtract time
        ZoneOffset eightHoursWest = hoursFrom(now.getOffset(), -8);
        OffsetDateTime nowBut8HoursWest = now.toOffsetDateTime().withOffsetSameInstant(eightHoursWest);
        System.out.printf("8 hours west of here it is %s\n", nowBut8HoursWest);
    }

    private ZoneOffset hoursFrom(ZoneOffset offset, int hours) {

        final int seconds = hours * 60 * 60;
        return ZoneOffset.ofTotalSeconds(offset.getTotalSeconds() + seconds);
    }
}
