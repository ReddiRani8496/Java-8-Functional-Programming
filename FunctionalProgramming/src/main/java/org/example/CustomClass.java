package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomClass {
    public static void main(String[] args) {
        List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));


        // allMatch, noneMatch, anyMatch

        // allMatch : check all the courses has review greater than 90, in any one doesn't match return false
        System.out.println(courses.stream().allMatch(course -> course.getReviewScore() > 95));

        // noneMatch: returns true, if all the courses doesn't match
        System.out.println(courses.stream().noneMatch(course -> course.getReviewScore() < 90));
        System.out.println(courses.stream().noneMatch(course -> course.getReviewScore() > 90));


        // anyMatch : returns true if any one course matches
        System.out.println(courses.stream().anyMatch(course -> course.getReviewScore() > 95));



        // sort courses
        Comparator<Course> comparingByNumberOfStudents = Comparator.comparing(Course::getNoOfStudents);
        List<Course> courses1 = courses.stream().sorted(comparingByNumberOfStudents).collect(Collectors.toList());
        System.out.println(courses1);

        Comparator<Course> comparingByNumberOfStudentsDecreasing = Comparator.comparing(Course::getNoOfStudents).reversed();
        System.out.println(courses.stream().sorted(comparingByNumberOfStudentsDecreasing).collect(Collectors.toList()));


        // comparing number of students and review score
        Comparator<Course> comparingByNumberOfStudentsAndReviews =
                Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore)
                        .reversed();
        System.out.println(courses.stream()
                .sorted(comparingByNumberOfStudentsAndReviews).collect(Collectors.toList()));



        // limit : limits the number of results
        System.out.println(courses.stream()
                .sorted(comparingByNumberOfStudentsAndReviews)
                        .limit(5)
                .collect(Collectors.toList()));

        // skip : skip first n results
        System.out.println(courses.stream()
                .sorted(comparingByNumberOfStudentsAndReviews)
                .limit(5)
                        .skip(3)
                .collect(Collectors.toList()));

        //takeWhile : until the condition meets prints the results
        System.out.println(
        courses.stream().takeWhile(course -> course.getReviewScore() >= 95)
                .collect(Collectors.toList())
        );

        //dropWhile : as long as the condition true it will drop the results, next results printed
        System.out.println(
                courses.stream()
                        .dropWhile(course -> course.getReviewScore() >= 95)
                        .collect(Collectors.toList())
        );


        // max : returns the last element of the list
        System.out.println(
                courses.stream()
                        .max(comparingByNumberOfStudentsAndReviews)
        );

        // min : returns the first element of the list
        System.out.println(
                courses.stream()
                        .min(comparingByNumberOfStudentsAndReviews)
        );

        // findfirst : returns first element greater than 95
        System.out.println(
                courses.stream()
                        .filter(course -> course.getReviewScore() > 95)
                        .findFirst()
        );

        // findAny : returns any element which matches this criteria
        System.out.println(
                courses.stream()
                        .filter(course -> course.getReviewScore() > 95)
                        .findAny()
        );

        // sum : total number of students in courses whose score greater than 95
        System.out.println(
                courses.stream()
                        .filter(course -> course.getReviewScore() > 95)
                        .mapToInt(Course::getNoOfStudents)
                        .sum()
        );

        // average : find average of all students in courses
        System.out.println(
                courses.stream()
                        .filter(course -> course.getReviewScore() > 95)
                        .mapToInt(Course::getNoOfStudents)
                        .average()
        );

        // count : how many elements met their criteria
        System.out.println(
                courses.stream()
                        .filter(course -> course.getReviewScore() > 95)
                        .mapToInt(Course::getNoOfStudents)
                        .count()
        );

        // group by courses
        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course :: getCategory))
        );

        // count number of courses in each category
        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course :: getCategory, Collectors.counting()))
        );


    }
}




class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        super();
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String toString() {
        return name + ":" + noOfStudents + ":" + reviewScore;
    }

}
