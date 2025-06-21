package algo250621;

import java.util.stream.*;

// 프로그래머스 - 두 정수 사이의 합 (Lv1)
public class Pro12912 {
    public long solution(int a, int b) {
        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b))
                        .asLongStream()
                        .sum();
    }
}
