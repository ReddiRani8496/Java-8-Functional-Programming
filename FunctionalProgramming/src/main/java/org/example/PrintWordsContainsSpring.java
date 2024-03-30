package org.example;

import java.util.List;

public class PrintWordsContainsSpring {
    public static void main(String[] args) {
        printAllWordsContainsSpring(List.of("spring","springboot","api","microservices","AWS","Azure","Docker","kubernates"));
    }

    private static void printAllWordsContainsSpring(List<String> words) {
        words.stream()
                .filter(word -> word.contains("spring"))
                .forEach(System.out::println);
    }
}
