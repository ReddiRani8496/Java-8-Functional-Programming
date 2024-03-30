package org.example;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        printEvenNums(List.of(1,2,3,4,5,6,7,8));
    }

    private static void printEvenNums(List<Integer> numbers) {
        Predicate<Integer> isEven = number -> number%2==0;
        // how internally works
        Predicate<Integer> even = new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number % 2 == 0;
            }
        };


        Function<Integer, Integer> squareFunction = number -> number * number;
        //how internally works
        Function<Integer,Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number * number;
            }
        };

        Consumer<Integer> sysoutConsumer = System.out::println;

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                System.out.println(number);
            }
        };

        numbers.stream()
                .filter(isEven)
                .map(squareFunction)
                .forEach(sysoutConsumer);
    }

    // filter -> Predicate
    // map -> Function
    // forEach -> consumer
    // reduce -> binary operator


    private int sum(List<Integer> numbers) {
//        return numbers.stream()
//                .reduce(0,Integer::sum);
        return numbers.stream()
                .reduce(0,binaryOperator);
    }

    BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
        @Override
        public Integer apply(Integer number1, Integer number2) {
            return number1 + number2;
        }
    };

    BinaryOperator<Integer> binaryOperator1 = Integer::sum;
}
