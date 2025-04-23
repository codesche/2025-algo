package algo250423;

// distinct를 사용한 중복 제거

import java.util.*;
import java.util.stream.*;

public class StreamDistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 5);

        numbers.stream()
            .distinct()                         // 중복 제거
            .forEach(System.out::println);
    }
}
