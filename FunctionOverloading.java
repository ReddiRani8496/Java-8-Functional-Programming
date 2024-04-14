package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionOverloading {
    static Integer sum(Integer a, Integer b) {
        return a + b;
    }
    static Double sum(Double a, Double b) {
        return a + b;
    }

    static Integer sum(Integer a) {
        return a;
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> integerSum = FunctionOverloading::sum;
        System.out.println(integerSum.apply(1, 2));

        BiFunction<Double, Double, Double> doubleSum = FunctionOverloading::sum;
        System.out.println(doubleSum.apply(1.0, 2.0));

        Function<Integer, Integer> sum = FunctionOverloading::sum;
        System.out.println(sum.apply(1));
    }
}
