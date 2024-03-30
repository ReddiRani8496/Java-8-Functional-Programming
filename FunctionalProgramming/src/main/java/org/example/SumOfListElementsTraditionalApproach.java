package org.example;

import java.util.List;

public class SumOfListElementsTraditionalApproach {
    public static void main(String[] args) {
        sumOfAllElements(List.of(1,2,3,4,5,6,7,8));
    }

    private static void sumOfAllElements(List<Integer> numbers) {
        int sum = 0;
        for(int number : numbers)
            sum += number;
        System.out.println(sum);
    }

}
