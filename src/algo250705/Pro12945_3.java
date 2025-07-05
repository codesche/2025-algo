package algo250705;

// 프로그래머스 - 피보나치 수 (Lv2), 다른 풀이
public class Pro12945_3 {
    private int[] memo;

    public int solution(int n) {
        memo = new int[n + 1];
        return fib(n);
    }

    private int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (memo[n] != 0) return memo[n];

        return memo[n] = (fib(n - 1) + fib(n - 2)) % 1234567;
    }
}
