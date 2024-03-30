package org.example;

import java.util.function.BiPredicate;

public class BiPredicateInterfaceEx {
    public static void main(String[] args) {
        // there will be two inputs and returns boolean
        BiPredicate<Integer,String> biPredicate = (number,str) -> {
            return number < 10 && str.length()==4;
        };
        System.out.println(biPredicate.test(3,"rani"));
    }
}
