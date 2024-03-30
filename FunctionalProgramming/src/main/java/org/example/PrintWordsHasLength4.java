package org.example;

import java.util.List;

public class PrintWordsHasLength4 {
    public static void main(String[] args) {
        printWordsOfLength4(List.of("spring","springboot","api","microservices","AWS","Azure","Docker","kubernates"));
    }

    private static void printWordsOfLength4(List<String> words) {
        words.stream()
                .filter(word -> word.length()>=4)
                .forEach(System.out::println);
    }
}
