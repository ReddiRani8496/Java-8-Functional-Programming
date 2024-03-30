package org.example;

import java.util.List;

public class LengthOfEachCourse {
    public static void main(String[] args) {
        printLengthOfEachCourse(List.of("spring","springboot","api","microservices","AWS","Azure","Docker","kubernates"));
    }

    private static void printLengthOfEachCourse(List<String> courses) {
        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }
}
