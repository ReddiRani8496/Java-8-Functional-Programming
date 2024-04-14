package org.example;

public class AnonymousClass {
    public static void main(String[] args) {
//        RBI rbi = new RBI() {  // anonymous class
//            @Override
//            public Double interest() {
//                return 3.5;
//            }
//        };
//        System.out.println(rbi.interest());

        RBI rbi = ()->3.5; // lambda expression
        System.out.println(rbi.interest());
    }
}

@FunctionalInterface
interface RBI {
    Double interest();
}
