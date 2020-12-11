package com.notaneye.learn.java12to15.records;


public class WhatsThePoint {

    public static void main(String[] args) {

        Point p = new Point(22, 105);
        System.out.println(p);
        Point q = p.move(16, -12);
        System.out.println(q);
        Point.Fine f = new Point.Fine(0.3);
        System.out.println(f);
        try {
            new Point.Fine(3.0);
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Whoops! %s", e.getMessage());
        }
    }
}
