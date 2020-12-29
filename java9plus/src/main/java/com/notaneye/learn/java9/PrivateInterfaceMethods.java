package com.notaneye.learn.java9;


/**
 * In addition to default implementations of interface methods, interfaces can
 * define private instance methods. These methods can only operate on their
 * parameters and invoke other methods of the interface.
 */
@SuppressWarnings("unused")
public class PrivateInterfaceMethods {

    /**
     * This interface has a default method and a private method.
     */
    public interface DoorKnob {

        void lock();

        void unlock();

        void unlatch();

        /**
         * The default method implementation can invoke the private method.
         */
        default void turn() {

            if (!isLocked()) {
                unlatch();
            }
            else {
                throwLockedException();
            }
        }

        boolean isLocked();

        boolean isLatched();

        /**
         * `private` really means private. Neither implementors nor
         * sub-interfaces can access this method.
         */
        private void throwLockedException() {

            throw new IllegalStateException("Door knob is locked");
        }
    }
}
