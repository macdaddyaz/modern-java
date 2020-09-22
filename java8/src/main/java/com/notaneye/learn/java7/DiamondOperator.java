package com.notaneye.learn.java7;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;


@SuppressWarnings("unused")
public class DiamondOperator {


    public static void main(String[] args) {

        final Queue<String> allTheThings = new ArrayDeque<>(new ArrayList<>(2));
        allTheThings.add("Thing 1");
        allTheThings.add("Thing 2");
        while (!allTheThings.isEmpty()) {
            System.out.println(allTheThings.remove());
        }
    }
}
