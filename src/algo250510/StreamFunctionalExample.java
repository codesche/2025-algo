package algo250510;

// 학생 목록에서 통계와 처리 작업 수행
/*
- 학생 목록 중 평균 점수 계산
- 이름이 'Kim'으로 시작하는 학생 필터링
- 학년별 그룹핑
- 점수 내림차순 정렬
- 100점 만점인 학생 이름 목록 추출
 */

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamFunctionalExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Kim Minsoo", 1, 85),
            new Student("Lee Jieun", 2, 92),
            new Student("Park Jisung", 1, 76),
            new Student("Kim Yuna", 2, 100),
            new Student("Choi Sooyoung", 3, 88),
            new Student("Kim Hyunwoo", 3, 100)
        );

        // 1. 전체 평균 점수 구하기
        double averageScore = students.stream()
            .mapToInt(Student::getScore)
            .average()
            .orElse(0.0);
        System.out.println("전체 평균 점수: " + averageScore);

        // 2. 이름이 'Kim' 으로 시작하는 학생 목록
        List<Student> kimStudents = students.stream()
            .filter(s -> s.getName().startsWith("Kim"))
            .collect(Collectors.toList());
        System.out.println("\n'Kim'으로 시작하는 학생: ");
        kimStudents.forEach(System.out::println);

        // 3. 학년별 그룹핑
        Map<Integer, List<Student>> groupedByGrade = students.stream()
            .collect(Collectors.groupingBy(Student::getGrade));
        System.out.println("\n학년별 그룹핑");
        groupedByGrade.forEach((grade, list) -> {
            System.out.println(grade + "학년: " + list);
        });

        // 4. 점수 내림차순 정렬
        List<Student> sortedByScore = students.stream()
            .sorted(Comparator.comparingInt(Student::getScore).reversed())
            .collect(Collectors.toList());
        System.out.println("\n점수 내림차순 정렬:");
        sortedByScore.forEach(System.out::println);

        // 5. 100점 만점인 학생 이름 목록
        List<String> perfectScorers = students.stream()
            .filter(s -> s.getScore() == 100)
            .map(Student::getName)
            .collect(Collectors.toList());
        System.out.println("\n100점 만점 학생:");
        perfectScorers.forEach(System.out::println);

        // 6. 함수형 인터페이스 조합 예시 (Function, Predicate)
        Function<Student, String> nameFunction = Student::getName;
        Predicate<Student> isPerfectScore = s -> s.getScore() == 100;

        System.out.println("\n100점 학생 (함수형 인터페이스 사용):");
        students.stream()
            .filter(isPerfectScore)
            .map(nameFunction)
            .forEach(System.out::println);
    }
}
