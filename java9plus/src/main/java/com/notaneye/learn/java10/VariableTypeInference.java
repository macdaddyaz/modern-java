package com.notaneye.learn.java10;


import java.util.Arrays;


// The `var` keyword was introduced as a shorthand variable declaration. The
// variable it declares is still fully typed, but the type is inferred from the
// right-hand side of the statement.
//
// Type inference only works in the following places:
// - local variables with initializers
// - indexes in the enhanced for-loop
// - locals declared in a traditional for-loop
public class VariableTypeInference {

    @SuppressWarnings({ "CommentedOutCode", "ForLoopReplaceableByForEach" })
    public static void main(String[] args) {

        var someNumbers = new int[] { 0, 2, 4, 6, 8 };
        // `someNumbers` is known to be of type `int[]`
        for (var i = 0; i < someNumbers.length; i++) {
            System.out.println(someNumbers[i]);
        }
        // The following line will not compile
        // someNumbers = new Object();
        var list = Arrays.asList("X", "Y", "Z");
        // `list` is known to be of type `List<String>`
        list.add(0, "A");
        for (var s : list) {
            System.out.println(s);
        }
        // The following lines will not compile
        // list.add(LocalDate.now());
        // list = new ArrayList<Object>();
    }
}
