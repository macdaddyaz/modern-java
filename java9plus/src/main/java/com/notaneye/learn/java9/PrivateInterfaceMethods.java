package com.notaneye.learn.java9;


// In addition to default implementations of interface methods, interfaces can
// define private instance methods. These methods can only operate on their
// parameters and invoke other methods of the interface.
@SuppressWarnings("unused")
public class PrivateInterfaceMethods {

    private interface DoorKnob {

        void lock();

        void unlock();

        void unlatch();

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

        // `private` really means private. Neither implementors nor
        // sub-interfaces can access this method.
        private void throwLockedException() {

            throw new IllegalStateException("Door knob is locked");
        }
    }
}
