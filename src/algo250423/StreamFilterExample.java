package algo250423;

import java.util.Arrays;
import java.util.List;

// 1. reduce를 이용한 합계 계산
public class StreamFilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 9);
        int sum = numbers.stream()
            .reduce(0, (a, b) -> a + b);

        System.out.println("합계: " + sum);
    }
}
