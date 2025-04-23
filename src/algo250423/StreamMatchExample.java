package algo250423;

import java.util.*;
import java.util.stream.*;

// anyMatch, allMatch 사용
// anyMatch : 조건에 맞는 요소가 하나라도 있으면 true 반환
// allMatch : 모든 요소가 조건에 맞을 때 true 반환
public class StreamMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 하나라도 짝수인지 확인
        boolean hasEven = numbers.stream()
            .anyMatch(n -> n % 2 == 0);
        System.out.println("짝수가 있나요? " + hasEven);

        // 모든 숫자가 짝수인지 확인
        boolean allEven = numbers.stream()
            .allMatch(n -> n % 2 == 0);
        System.out.println("모든 숫자가 짝수인가요? " + allEven);
    }
}
