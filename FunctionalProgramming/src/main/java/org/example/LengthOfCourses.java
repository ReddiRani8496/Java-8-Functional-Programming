package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class LengthOfCourses {
    public static void main(String[] args) {
        List<Integer> courses = listOfCourseLength(List.of("spring","springboot","api","microservices","AWS","Azure","Docker","kubernates"));

        for(int length : courses)
            System.out.println(length);
    }

    private static List<Integer> listOfCourseLength(List<String> courses) {
        return courses.stream()
                .map(course -> course.length())
                .collect(Collectors.toList());
    }
}
