package org.example;

import java.util.List;

public class PrintEvenNumbersFunctionalApproach {
    public static void main(String[] args) {
        printEvenNumbers(List.of(1,2,3,4,5,6,7,8));
    }
//    public static void printEvenNumbers(List<Integer> numbers) {
//        numbers.stream().filter(PrintEvenNumbersFunctionalApproach::isEven).forEach(System.out::println);
//    }
    private static boolean isEven(int number) {
        return number%2==0;
    }

    // but this approach is complex than traditional approach, instead of using isEven method, we can use
    // lambda expressions
    // number -> number%2==0
    // in the above statement we are telling, take the number input, check whether it is even or not
    private static void printEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2==0)
                .forEach(System.out::println);
    }
}
