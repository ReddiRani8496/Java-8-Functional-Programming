package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> evenNumbers =  evenList(List.of(1,2,3,4,5,6,7,8));
        
        for(int number : evenNumbers)
            System.out.println(number);
    }

    private static List<Integer> evenList(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }
}
