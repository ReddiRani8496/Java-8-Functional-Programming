package org.example;

import java.util.List;

public class PrintEvenNumsInListNormalApproach {
    public static void main(String[] args) {
        printEvenNumbers(List.of(1,2,3,4,5,6));
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0)
                System.out.println(number);
        }
    }
}
