package com.notaneye.learn.java12to15;


public class ImprovedNullPointerExceptions {

    public static void main(String[] args) {

        methodA();
    }

    private static void methodA() {

        methodB();
    }

    private static void methodB() {

        methodToMyMadness();
    }

    @SuppressWarnings({"java:S2201", "ResultOfMethodCallIgnored"})
    private static void methodToMyMadness() {
        var nested = new SomethingNested(null);
        nested.value().length();
    }

    private record SomethingNested(String value) {

    }
}
