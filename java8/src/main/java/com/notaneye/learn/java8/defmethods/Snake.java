package com.notaneye.learn.java8.defmethods;


public class Snake implements Animal {

    @Override
    public int numberOfLegs() {

        return 0;
    }


    @Override
    public void move() {

        System.out.println("I'm slithering");
    }
}
