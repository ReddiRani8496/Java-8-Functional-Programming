package org.example;

import java.util.List;
import java.util.function.Predicate;

public class PrintEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        filterAndPrint(numbers, number -> number%2==0);
        filterAndPrint(numbers, number -> number % 2 != 0);
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
