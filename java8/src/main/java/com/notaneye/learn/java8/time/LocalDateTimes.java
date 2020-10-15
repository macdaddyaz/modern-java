package com.notaneye.learn.java8.time;


import com.notaneye.learn.java8.time.ModernDatesAndTimes.Demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.util.Date;


public class LocalDateTimes implements Demo {

    private LocalDate today;
    private LocalTime currentTime;
    private LocalDateTime now;


    public void demo() {

        begin("java.time.LocalDateTime/LocalDate/LocalTime");
        today = LocalDate.now();
        currentTime = LocalTime.now();
        now = LocalDateTime.now();
        creation();
        fieldAccessAndModification();
        addAndSubtract();
        comparison();
        conversion();
        finish();
    }


    private void creation() {

        System.out.println("----- Creation -----");
        LocalDateTime clockTower = LocalDateTime.of(1955, Month.NOVEMBER, 12, 22, 4);
        System.out.printf("Save the clock tower! %s\n", clockTower);
        LocalDate theDay = clockTower.toLocalDate();
        LocalTime theTime = clockTower.toLocalTime();
        System.out.printf("Just the day: %s\n", theDay);
        System.out.printf("Just the time: %s\n", theTime);
        LocalDate redLetterDayInHistory = LocalDate.of(1955, 11, 5);
        System.out.printf("Another red letter day in history: %s\n", redLetterDayInHistory);
    }


    private void fieldAccessAndModification() {

        System.out.println("----- Field Access & Modification -----");
        System.out.printf("Today is day %s\n", today.getDayOfWeek());
        System.out.printf("Today is day %d of %d\n", today.getDayOfYear(), today.getYear());
        LocalDateTime other = now.withMonth(9).withHour(1);
        System.out.printf("Now, but in September after 1 AM: %s\n", other);
        System.out.printf("Are the 2 date/times the same object? %s\n", now == other ? "Yep" : "No way");
    }


    private void addAndSubtract() {

        System.out.println("----- Add & Subtract -----");
        LocalDate twoDaysAgo = today.minusDays(2);
        System.out.printf("Two days ago was %s\n", twoDaysAgo);
        LocalTime in3Hours12Minutes = currentTime.plusHours(3).plusMinutes(12);
        System.out.printf("In 3 hours, 12 minutes, the time will be %s\n", in3Hours12Minutes);
        LocalDateTime tomorrow = now.plusDays(1);
        System.out.printf("Tomorrow will be %s\n", tomorrow);
    }


    private void comparison() {

        System.out.println("----- Comparison -----");
        LocalDateTime bttfDay = LocalDateTime.of(2015, 10, 21, 19, 28, 0);
        System.out.printf("Back to the Future Day is in the %s\n", bttfDay.isBefore(now) ? "past" : "future");
        LocalTime highNoon = LocalTime.of(12, 0, 0, 0);
        System.out.printf("Right now it is %s high noon\n", currentTime.isAfter(highNoon) ? "after" : "before");
    }


    private void conversion() {

        System.out.println("----- Conversion -----");
        LocalDateTime notNow = LocalDateTime.of(today, currentTime);
        System.out.println(notNow);
        LocalDate anotherDay = now.toLocalDate();
        System.out.println(anotherDay);
        LocalTime thisTime = now.toLocalTime();
        System.out.println(thisTime);
        LocalDateTime thisMorningAtMidnight = today.atStartOfDay();
        System.out.println(thisMorningAtMidnight);
        LocalDateTime notThisTime = currentTime.atDate(anotherDay);
        System.out.println(notThisTime);
        Date oldAndBusted = Date.from(now.toInstant(ZoneOffset.ofHours(7)));
        System.out.println(oldAndBusted);
    }
}
