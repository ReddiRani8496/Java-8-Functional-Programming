package org.example;

import java.util.function.BiFunction;

public class BiFunctionInterfaceEx {
    public static void main(String[] args) {
        // takes two input, return type should be anything
        // takes three parameters, first and second indicates input types, third parameter defines return type
        BiFunction<Integer,String, String> biFunction = (number, str) -> {
            return number + " " + str;
        };
        System.out.println(biFunction.apply(10,"rani"));
    }
}
