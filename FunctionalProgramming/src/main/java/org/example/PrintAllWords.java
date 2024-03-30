package org.example;

import java.util.List;

public class PrintAllWords {
    public static void main(String[] args) {
        printAllWords(List.of("spring","springboot","api","microservices","AWS","Azure","Docker","kubernates"));
    }

    private static void printAllWords(List<String> words) {
        words.stream().forEach(System.out::println);
    }
}
