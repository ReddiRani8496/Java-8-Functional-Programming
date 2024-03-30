package org.example;

import java.util.List;

public class PrintNumbersInListFunctionalApproach {
    public static void main(String[] args) {
        printNumbersInListFunctionalApproach(List.of(10,20,30,40,50));
    }

    private static void printNumbersInListFunctionalApproach(List<Integer> numbers) {
        // first we have convert the list into streams, using stream()
        // 10
        // 20
        // 30
        // 40
        // 50
        // when each element comes we have to print that number
        //numbers.stream().forEach(System.out::println);
        // method reference is using, since print number is static method, we can call using class name
        numbers.stream().forEach(PrintNumbersInListFunctionalApproach::printNumber);
    }

    private static void printNumber(int number) {
        System.out.println(number);
    }
}
