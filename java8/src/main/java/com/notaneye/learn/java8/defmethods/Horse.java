package com.notaneye.learn.java8.defmethods;


public class Horse implements Animal {

    @Override
    public int numberOfLegs() {

        return 4;
    }


    @Override
    public void move() {

        System.out.println("Running free!");
    }
}
