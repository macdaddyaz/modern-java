package com.notaneye.learn.java12to15;


import java.time.DayOfWeek;
import java.time.LocalDate;


/**
 * <p>
 * Switch expressions have somewhat different semantics than a switch statement.
 * First, and most obviously, it's an expression, rather than a statement. Why
 * does that matter? Because expressions can be used within larger statements,
 * such as variable assignments. This simplifies the scenario where a switch is
 * being used to determine a value for a variable. Rather than declaring the
 * variable first, then assigning it under each case, the variable declaration
 * can be initialized with the result of the switch expression.
 * </p>
 * <p>
 * Second, switch expressions do not have the "fall-through" behavior that
 * statements exhibit between cases. Therefore {@code break}'s are not needed.
 * Instead, each case is a distinct, language-level block.
 * </p>
 * <p>
 * That leads to the third difference, which involves the scope of variables
 * declared within the switch. In switch statements, variables declared under
 * one case are "visible" within the other cases (in that the same variable name
 * cannot be declared again). However, within expressions, each case block is a
 * separate scope, so the variables do not interfere with each other.
 * </p>
 */
public class SwitchExpressions {

    public static void main(String[] args) {

        checkItOut(LocalDate.now().getDayOfWeek());
    }


    private static void checkItOut(DayOfWeek day) {

        // Note that we are initializing the value of `s` directly from the
        // result of the switch. Also note that we use `var` to declare the
        // variable -- the type is inferred to be the result of the switch. This
        // also implies that:
        //   - Each case block produces the same (or compatible) types
        //   - The cases exhaustively match all possible values
        var s = switch (day) {
            // A case can be a multi-line block, in which case it must be
            // enclosed in braces
            case SUNDAY -> {
                System.out.println("We're printing because it's Sunday");
                // Since the expression is expected to produce a value, we must
                // `yield` it out of the block (not `return`).
                yield "Almost time to go back to work";
            }
            // The following cases simply produce a value, so we use a lambda-
            // like shorthand.
            case FRIDAY -> "Almost there";
            case SATURDAY -> "Party time!";
            default -> "Get to work, slacker!";
            // The following would also work in lieu of the `default`. The
            // requirement is for the cases to exhaustively match all possible
            // values of the switch subject.
            // case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> "Get to work, slacker!";
        };
        System.out.println(s);
    }
}
