package com.notaneye.learn.java12to15.records;


/**
 * <p>
 * This "header" condenses the declaration of the class, its canonical
 * constructor, its full state (made up of `private final` members of the same
 * name/type), and public accessors for each member.
 * </p>
 * <p>
 * No other constructors or state are allowed, and the state (being final)
 * cannot be mutated. Static initializers are forbidden. Furthermore, the record
 * cannot extend any other class (the generated class extends
 * `java.lang.Record`, but even this cannot be done explicitly).
 * </p>
 * <p>
 * Records can implement interfaces, and can be generic. Most of the
 * auto-generated members can be manually implemented (see below).
 * </p>
 */
public record Point(int x, int y) {

    /**
     * Regular public methods just become part of the object's API.
     */
    public Point move(int x, int y) {

        return new Point(this.x + x, this.y + y);
    }


    /**
     * Records auto-generate their .equals(), .hashCode(), and .toString()
     * methods, but we can also provide our own implementation of any of them.
     */
    @Override
    public String toString() {

        return String.format("(%d, %d)", x, y);
    }


    /**
     * Records can contain nested records. Though not stated, these nested
     * records are implicitly static. The canonical constructor can also be
     * implemented with a shorthand syntax.
     */
    public record Fine(double adjustment) {

        /**
         * Shorthand syntax for declaring the canonical constructor. Notice the
         * lack of a parameter list.
         */
        public Fine {

            if (adjustment < 0.0 || adjustment > 1.0) {
                throw new IllegalArgumentException("Too fine a point");
            }
        }
    }
}
