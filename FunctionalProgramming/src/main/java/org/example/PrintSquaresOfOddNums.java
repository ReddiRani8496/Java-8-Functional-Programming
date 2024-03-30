package org.example;

import java.util.List;

public class PrintSquaresOfOddNums {
    public static void main(String[] args) {
        printSquaresOfOddNumbers(List.of(1,2,3,4,5,6,7,8));

    }

    private static void printSquaresOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 != 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }
}
