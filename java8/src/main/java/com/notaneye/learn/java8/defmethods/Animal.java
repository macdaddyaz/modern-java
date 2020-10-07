package com.notaneye.learn.java8.defmethods;


public interface Animal {

    int numberOfLegs();

    default void move() {

        System.out.println("I'm crawling!");
    }
}
