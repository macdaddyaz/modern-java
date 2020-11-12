package com.notaneye.learn.java8.annotation;


import java.util.Arrays;


public class RepeatingAnnotations {

    public static void main(String[] args) {

        Arrays.stream(DaBomb.class.getAnnotations()).forEach(System.out::println);
        Arrays.stream(SweetNAwesome.class.getAnnotations()).forEach(System.out::println);
    }
}
