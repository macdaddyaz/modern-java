package com.notaneye.learn.java8.time;


import java.util.stream.Stream;


public class ModernDatesAndTimes {

    public static void main(String[] args) {

        // Cool! The `forEach` call automatically infers the type of the `of` call
        Stream
                .of(new Instants(),
                    new LocalTimes(),
                    new TimeZonesAndOffsets(),
                    new Durations(),
                    new Periods(),
                    new Formatting())
                .forEach(Demo::demo);
    }


    public interface Demo {

        void demo();

        default void begin(String name) {

            System.out.printf("*** %s ***\n", name);
        }

        default void finish() {

            System.out.println();
        }
    }
}
