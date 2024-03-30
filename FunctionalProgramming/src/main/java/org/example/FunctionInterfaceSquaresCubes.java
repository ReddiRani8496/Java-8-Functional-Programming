package org.example;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInterfaceSquaresCubes {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
       List<Integer> squaredNumbers = mapAndCreateNewList(list, number -> number * number);
        List<Integer> cubeNumbers = mapAndCreateNewList(list, number -> number * number * number);
    }
    private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer,Integer> mappingFunction) {
       return numbers.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }
}
