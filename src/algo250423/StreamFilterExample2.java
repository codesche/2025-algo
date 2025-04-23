package algo250423;

import java.util.Arrays;
import java.util.List;

// 리스트에서 짝수만 필터링하기
// filter는 조건을 만족하는 요소만 남김
public class StreamFilterExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
