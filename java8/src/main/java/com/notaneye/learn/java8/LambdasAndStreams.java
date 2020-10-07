package com.notaneye.learn.java8;


import java.util.Collections;
import java.util.stream.Stream;


public class LambdasAndStreams {

    public static void main(String[] args) {

        final int maxIterations = 10;
        //@formatter:off
               // Create a new stream that generates numbers, starting at 1 and incrementing by 1
               // Uses an inline lambda expression
        Stream.iterate(1, (val) -> val + 1)
              // Another inline lambda expression
              // The result of the expression becomes the return value
              .filter((num) -> num % 4 == 0)
              // Use the MyStreamOperation constructor as a lambda
              // This works because the `map` method expects a `Function`, and the constructor
              // satisfies the contract of that interface.
              .map(MyStreamOperation::new)
              // Define a multi-statement lambda
              // `peek` lets us inspect or modify the object passing through the stream, but
              // not replace it.
              .peek((op) -> {
                  if (op.base() % 3 == 0) {
                      op.addSuffix("!");
                  }
                  else {
                      op.addSuffix("?");
                  }
              })
              // Use an instance method reference as a lambda
              .map(MyStreamOperation::toString)
              .limit(maxIterations)
              .forEach(System.out::println);
        //@formatter:on
    }


    private static class MyStreamOperation {

        private static final int FACTOR = 10;
        private final int num;
        private String suffix = "";


        public MyStreamOperation(int base) {

            this.num = base * FACTOR;
        }


        public int base() {

            return this.num / FACTOR;
        }


        public void addSuffix(String suffix) {

            this.suffix = suffix;
        }


        @Override
        public String toString() {

            int indentLevel = this.base() - 1;
            String indent = String.join("", Collections.nCopies(indentLevel, " "));
            return indent + this.num + this.suffix;
        }
    }
}
