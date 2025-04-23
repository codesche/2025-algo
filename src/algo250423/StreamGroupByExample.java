package algo250423;

import java.util.*;
import java.util.stream.*;

// groupingBy를 이용한 나이별 그룹핑
class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StreamGroupByExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Tom", 1),
            new Student("Jerry", 2),
            new Student("Anna", 1),
            new Student("Leo", 2)
        );

        // groupingBy는 특정 키를 기준으로 그룹핑할 수 있음
        Map<Integer, List<Student>> studentsByGrade = students.stream()
            .collect(Collectors.groupingBy(s -> s.grade));

        studentsByGrade.forEach((grade, group) -> {
            System.out.println("학년: " + grade);
            group.forEach(s -> System.out.println(" - " + s.name));
        });
    }
}
