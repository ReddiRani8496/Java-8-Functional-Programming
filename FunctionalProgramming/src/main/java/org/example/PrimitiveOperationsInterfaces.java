package org.example;

import java.util.function.IntBinaryOperator;

public class PrimitiveOperationsInterfaces {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (number1, number2) -> number1+number2;
        System.out.println(intBinaryOperator.applyAsInt(10,20));


    }
}
