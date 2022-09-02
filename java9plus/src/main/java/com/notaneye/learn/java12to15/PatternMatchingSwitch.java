package com.notaneye.learn.java12to15;

import java.io.PrintStream;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * <p>Pattern matching in {@code switch} statements/expressions further improves on the {@code instanceof} enhancement
 * finalized in Java 16. As of Java 18, this is still in "preview" status. Java 19 continues the preview and includes
 * a couple of small refinements (see below).</p>
 * <p>Furthermore, the {@code case} labels must be <i>exhaustive</i> &mdash; the compiler will check to be sure that
 * every possible value of the selector expression is covered by a case. At its simplest, this is done with a
 * {@code default} case. However, if there are a finite number of possible matches, {@code default} can be omitted. In
 * fact, the compiler will issue an error if {@code default} is used when all possibilities are already covered.</p>
 */
public class PatternMatchingSwitch {

    public static void main(String[] args) {

        whatIsIt("BOOM!");
        whatIsIt(LocalDate.now());
        whatIsIt(System.out);
        whatIsIt(38L);
        whatIsIt(203_344_128L);
        whatIsIt(BigInteger.valueOf(42L));
    }

    @SuppressWarnings("java:S131")
    private static void whatIsIt(Object val) {

        String whatItIs = switch (val) {
            case String str -> String.format("This is a string: %s", str);
            case LocalDate date -> String.format("%s", date.format(DateTimeFormatter.ISO_LOCAL_DATE));
            case PrintStream prt -> {
                prt.println("This is a PrintStream");
                yield "Got us a PrintStream, folks";
            }
            // The new variable can immediately be used, even in further comparisons
            // Note that the preview of this feature in Java 19 replaces `&&` with `when`:
            //   case Long l when l < 50L -> ...
            case Long l && l < 50L -> String.format("A small long value: %d", l);
            case Long l -> String.format("A bigger long value: %d", l);
            // We can combine cases. Cool!
            // Also note that we could replace `default` with `Object o`, since `Object` covers all remaining cases.
            case null, default -> "I don't know what the heck this thing is!";
        };
        System.out.println(whatItIs);
    }
}
