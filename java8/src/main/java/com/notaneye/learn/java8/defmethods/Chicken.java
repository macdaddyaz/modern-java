package com.notaneye.learn.java8.defmethods;


public class Chicken implements Animal {

    @Override
    public int numberOfLegs() {

        return 2;
    }


    @Override
    public void move() {

        System.out.println("Just walking because I don't fly well");
    }
}
