package com.notaneye.learn.java9;


/**
 * JShell is a command line REPL for Java (read-evaluate-print-loop). It does
 * all the things you'd expect from a REPL, allowing you to import classes,
 * declare variables, create classes and objects, etc. Very useful for rapid
 * prototyping.
 * <pre>
 * $ jshell
 * |  Welcome to JShell -- Version 15
 * |  For an introduction type: /help intro
 *
 * jshell> var x = 20;
 * x ==> 20
 *
 * jshell> void printX() {
 *    ...>     System.out.println(x);
 *    ...> }
 * |  created method printX()
 *
 * jshell> /list
 *
 *    1 : var x = 20;
 *    2 : void printX() {
 *            System.out.println(x);
 *        }
 *
 * jshell> printX();
 * 20
 *
 * jshell> /exit
 * |  Goodbye
 * </pre>
 *
 * @see <a href="https://docs.oracle.com/en/java/javase/15/docs/specs/man/jshell.html">JShell command reference</a>
 */
public class JShell {

}
