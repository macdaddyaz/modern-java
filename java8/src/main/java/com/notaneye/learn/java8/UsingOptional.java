package com.notaneye.learn.java8;


import java.security.SecureRandom;
import java.util.Optional;
import java.util.Random;


public class UsingOptional {

    private static final Random RND = new SecureRandom();


    public static void main(String[] args) {

        Optional<String> jenny = Optional.ofNullable(callMeMaybe());
        jenny.ifPresent(System.out::println);
        try {
            String number = jenny.orElseThrow(TakeAHikeLoser::new);
            System.out.printf("  (%s)\n", number);
        }
        catch (TakeAHikeLoser e) {
            System.out.println("Forever alone...");
        }
    }


    private static String callMeMaybe() {

        if (RND.nextBoolean()) {
            return "867-53-Oh-Niiiii-yine";
        }
        else {
            return null;
        }
    }


    private static final class TakeAHikeLoser extends Exception {

    }
}
