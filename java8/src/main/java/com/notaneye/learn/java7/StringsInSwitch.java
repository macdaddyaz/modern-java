package com.notaneye.learn.java7;


public class StringsInSwitch {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.err.println("😡 I've come here for a good argument");
            System.exit(1);
        }
        String arg = args[0];
        //noinspection EnhancedSwitchMigration
        switch (arg) {
        case "parrot":
            System.out.println("🦜 He's probably pining for the fjords");
            break;
        case "swallow":
            System.out.println("🥥 A five ounce bird cannot carry a one pound coconut!");
            break;
        default:
            System.out.println("🤷‍ You've stumped me");
        }
    }
}
