package com.notaneye.learn.java8.time;


import com.notaneye.learn.java8.time.ModernDatesAndTimes.Demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;


public class LocalTimes implements Demo {

    private LocalDate today;
    private LocalTime currentTime;
    private LocalDateTime now;


    public void demo() {

        begin("java.time.LocalDateTime");
        today = LocalDate.now();
        currentTime = LocalTime.now();
        now = LocalDateTime.now();
        localDateTime();
        fieldAccessAndModification();
        addAndSubtract();
        comparison();
        conversion();
        finish();
    }


    private void localDateTime() {

        System.out.println("----- LocalDateTime -----");
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
        LocalDateTime now = LocalDateTime.of(today, currentTime);
        System.out.printf("Combine LocalDate & LocalTime: %s\n", now);
        LocalDate anotherDay = this.now.toLocalDate();
        System.out.printf("Extract a LocalDate: %s\n", anotherDay);
        LocalTime thisTime = this.now.toLocalTime();
        System.out.printf("Extract a LocalTime: %s\n", thisTime);
        LocalDateTime thisMorningAtMidnight = today.atStartOfDay();
        System.out.printf("Get the start of a day: %s\n", thisMorningAtMidnight);
        LocalDateTime notThisTime = currentTime.atDate(anotherDay);
        System.out.printf("Add a LocalDate to a LocalTime: %s\n", notThisTime);
        Date oldAndBusted = Date.from(this.now.atZone(ZoneId.systemDefault()).toInstant());
        System.out.printf("Create a pre-Java 8 Date: %s\n", oldAndBusted);
    }
}
