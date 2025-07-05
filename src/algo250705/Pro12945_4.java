package algo250705;

import java.util.stream.*;

// 프로그래머스 - 피보나치 수 (Lv2), 다른 풀이
public class Pro12945_4 {
    public int solution(int n) {
        int[] fib = new int[n + 1];     // 배열 선언, n + 1
        fib[1] = 1;

        IntStream.rangeClosed(2, n).forEach(
            i -> fib[i] = (fib[i - 1] + fib[i - 2]) % 1234567
        );

        return fib[n];
    }
}
