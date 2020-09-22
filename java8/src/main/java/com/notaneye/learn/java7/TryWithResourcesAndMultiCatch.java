package com.notaneye.learn.java7;


import java.io.IOException;
import java.io.InvalidClassException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;


public class TryWithResourcesAndMultiCatch {

    public static void main(String[] args) {

        try (ObjectOutputStream out = new ObjectOutputStream(System.out)) {

            out.writeObject(new MyWord("Bird"));
        }
        catch (InvalidClassException | NotSerializableException e) {
            System.err.printf("Ya dun broke it: %s", e);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static final class MyWord {

        private final String word;


        public MyWord(String word) {

            this.word = word;
        }


        @SuppressWarnings("unused")
        public String getWord() {

            return this.word;
        }
    }
}
