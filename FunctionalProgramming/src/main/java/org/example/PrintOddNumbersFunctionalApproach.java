package org.example;

import java.util.List;

public class PrintOddNumbersFunctionalApproach {
    public static void main(String[] args) {
        printOddNumbers(List.of(1,2,3,4,5,6,7,8));
    }

    private static void printOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 != 0)
                .forEach(System.out::println);
    }
}
