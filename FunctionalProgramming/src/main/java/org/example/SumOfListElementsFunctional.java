package org.example;

import java.util.List;

public class SumOfListElementsFunctional {
    public static void main(String[] args) {
       int sum = sumOfAllElements(List.of(1,2,3,4,5,6,7,8));
        System.out.println(sum);
        int sumUsingReduce = sumElements(List.of(1,2,3,4,5,6,7,8));
        System.out.println(sumUsingReduce);
    }

    private static int sumOfAllElements(List<Integer> numbers) {
       return numbers.stream()
                .reduce(0, SumOfListElementsFunctional::sum);
    }
    private static int sum(int aggregate, int nextNumber) {
       // System.out.println(aggregate + " , " + nextNumber);
        return aggregate + nextNumber;
    }

    private static int sumElements(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (aggregate,nextNumber)-> aggregate + nextNumber);
    }
}
