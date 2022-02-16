package Lesson9HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//1. Написать функцию, принимающую список Student и возвращающую список уникальных курсов, на которые подписаны студенты.
//        2. Написать функцию, принимающую на вход список Student и возвращающую список из трех самых любознательных (любознательность определяется количеством курсов).
//        3. Написать функцию, принимающую на вход список Student и экземпляр Course, возвращающую список студентов, которые посещают этот курс.
public class Main {

    public static List<Student> students = new ArrayList<Student>(Arrays.asList(


            new Student("Vladimir", Arrays.asList(new Course("Java"))),
            new Student("Aleksei", Arrays.asList(new Course("Python"), new Course("Linux"))),
            new Student("Andrey", Arrays.asList(new Course("Linux"), new Course("Html"), new Course("Java")))
    ));

    public static Course course = new Course("Linux");


    public static List<Course> uniqueCourses(List<Student> students) {

        return students.stream()
                .map(f -> f.getCourses())
                .flatMap(f -> f.stream())
                .distinct()
                .collect(Collectors.toList());

    }

    public static List<Student> uniqueStudents(List<Student> students) {
        return students.stream()
                .sorted((p1, p2) -> p2.getCourses().size() - p1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList());

    }

    public static List<String> visitedCourse(List<Student> students, Course course) {

        return students.stream()
                .filter(p -> p.getCourses().contains(course))
                .map(Student::getName)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {

        System.out.println("Список уникальных курсов: ");
        System.out.println(uniqueCourses(students));
        System.out.println("Самые любознательные студенты");
        System.out.println(uniqueStudents(students));
        System.out.println("Студенты на одном курсе");
        System.out.println(visitedCourse(students,course));

    }


}
