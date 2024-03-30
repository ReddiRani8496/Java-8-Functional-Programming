package org.example;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {
    public static void main(String[] args) {
        // It will take the input, and returns the output of same type
        UnaryOperator<Integer> unaryOperator = (number) -> number * 2;
        System.out.println(unaryOperator.apply(10));
    }
}
