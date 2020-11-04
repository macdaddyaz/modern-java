package com.notaneye.learn.java8.time;


import com.notaneye.learn.java8.time.ModernDatesAndTimes.Demo;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Formatting implements Demo {

    private final ZonedDateTime now = ZonedDateTime.now();


    public void demo() {

        begin("Formatting");
        isoLocal();
        isoOffset();
        isoZoned();
        localized();
        custom();
    }


    private void isoLocal() {

        section("ISO-8601 local dates/times");
        print(DateTimeFormatter.ISO_LOCAL_DATE);
        print(DateTimeFormatter.ISO_LOCAL_TIME);
        print(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }


    private void isoOffset() {

        section("ISO-8601 offset dates/times");
        print(DateTimeFormatter.ISO_OFFSET_DATE);
        print(DateTimeFormatter.ISO_OFFSET_TIME);
        print(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }


    private void isoZoned() {

        section("ISO-8601 zoned dates/times");
        print(DateTimeFormatter.ISO_ZONED_DATE_TIME);
        print(DateTimeFormatter.ISO_DATE_TIME);
    }


    private void localized() {

        section("Localized dates/times");
        print(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        print(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        print(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG));
        print(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
        print(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.LONG));
        print(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
    }


    private void custom() {

        section("Custom formatting");
        print(DateTimeFormatter.ofPattern("yyyyMMddkkmmss"));
        print(DateTimeFormatter.ofPattern("yyyy-ww-DD GG '{'VV'}'"));
    }


    private void print(DateTimeFormatter formatter) {

        System.out.println(now.format(formatter));
    }
}
