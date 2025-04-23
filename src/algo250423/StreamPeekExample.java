package algo250423;

import java.util.*;
import java.util.stream.*;

// peek를 이용한 디버깅
// peek은 스트림의 요소가 처리되는 중간에 실행되므로 디버깅이나 로깅에 유용하다.
// 요소를 변형하지 않으면서 확인할 수 있다.
public class StreamPeekExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
            .filter(n -> n % 2 == 0)
            .peek(n -> System.out.println("필터링된 값 : " + n))     // 중간 연산 중 디버깅
            .map(n -> n * 2)
            .forEach(System.out::println);
    }
}
