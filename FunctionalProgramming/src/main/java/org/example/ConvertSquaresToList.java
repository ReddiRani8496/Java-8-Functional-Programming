package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertSquaresToList {
    public static void main(String[] args) {
      List<Integer> list =  doubleList(List.of(1,2,3,4,5,6,7,8));

      for(int num : list)
          System.out.println(num);
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }
}
