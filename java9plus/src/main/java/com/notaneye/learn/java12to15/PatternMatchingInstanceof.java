package com.notaneye.learn.java12to15;


import java.io.PrintStream;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * <p>
 * The {@code instanceof} operator becomes the first recipient of Java's foray
 * into language-level "pattern matching". It elevates the operator from a
 * runtime check to a compile-time one. In other words, the compiler is able to
 * use the {@code instanceof} operator to infer at compile-time that the subject
 * of the comparison is of the asserted type. It can then directly (and safely!)
 * cast the subject into a new variable of desired type.
 * </p>
 * <p>
 * This change simplifies this common pattern:
 * <pre>
 * if (obj instanceof SomeClass) {
 *     SomeClass sc = (SomeClass) obj;
 *     // use sc...
 * }
 * </pre>
 * </p>
 * <p>
 * Instead, we can merge those two lines into one:
 * <pre>
 * if (obj instanceof SomeClass sc) {
 *     // ----------------------^^
 *     // use sc...
 * }
 * </pre>
 * </p>
 */
public class PatternMatchingInstanceof {

    public static void main(String[] args) {

        whatIsIt("BOOM!");
        whatIsIt(LocalDate.now());
        whatIsIt(System.out);
        whatIsIt(38L);
        whatIsIt(203_344_128L);
        whatIsIt(BigInteger.valueOf(42L));
    }

    private static void whatIsIt(Object val) {

        if (val instanceof String str) {
            System.out.printf("This is a string: %s%n", str);
        }
        else if (val instanceof LocalDate date) {
            System.out.printf("%s%n", date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        }
        else if (val instanceof PrintStream prt) {
            prt.println("This is a PrintStream");
        }
        // The new variable can immediately be used, even in further comparisons
        else if (val instanceof Long l && l < 50L) {
            System.out.printf("A small long value: %d%n", l);
        }
        else if (val instanceof Long l) {
            System.out.printf("A bigger long value: %d%n", l);
        }
        else {
            System.out.println("I don't know the heck this thing is!");
        }
    }
}
