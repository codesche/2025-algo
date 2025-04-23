package algo250423;

import java.util.*;
import java.util.stream.*;

// 객체 리스트에서 특정 필드 추출 및 정렬
// 나이 기준 정렬 후 이름 추출
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StreamFilterExample4 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        );

        List<String> sortedNames = people.stream()
            .sorted(Comparator.comparingInt(p -> p.age))
            .map(p -> p.name)
            .collect(Collectors.toList());

        System.out.println(sortedNames);
    }
}
