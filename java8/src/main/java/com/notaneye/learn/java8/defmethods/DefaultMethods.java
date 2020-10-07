package com.notaneye.learn.java8.defmethods;


public class DefaultMethods {

    public static void main(String[] args) {

        printAnimal(new Horse());
        printAnimal(new Spider());
        printAnimal(new Chicken());
        printAnimal(new Snake());
        printAnimal(new Centipede());
    }

    private static void printAnimal(Animal animal) {

        System.out.printf("I have %d legs\n", animal.numberOfLegs());
        animal.move();
    }
}
