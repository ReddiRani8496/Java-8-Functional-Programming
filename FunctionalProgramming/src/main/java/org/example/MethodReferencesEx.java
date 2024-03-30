package org.example;

import java.util.List;

public class MethodReferencesEx {
    public static void main(String[] args) {
        List<String> courses = List.of("spring","springboot","api","microservices","AWS","Azure","Docker","kubernates");
        courses.stream()
//                .map(course -> course.toUpperCase())
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
