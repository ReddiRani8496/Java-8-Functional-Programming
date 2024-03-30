package org.example;

import java.util.Arrays;
import java.util.List;

public class PrintNumbersInListNormalApproach {
    public static void main(String[] args) {
//        printNumbersInStructuredApproach(List.of(10,12,13,14,15,16));
        printNumbersInStructuredApproach(Arrays.asList(10, 12, 13, 14, 15, 16));
    }

    private static void printNumbersInStructuredApproach(List<Integer> integers) {
        for(int number : integers) {
            System.out.println(number);
        }
    }
}
