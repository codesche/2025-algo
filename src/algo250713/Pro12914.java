package algo250713;

// 프로그래머스 - 멀리 뛰기 (Lv2)
public class Pro12914 {
    public long solution(int n) {
        long[] dp = new long[n + 2];
        // 3가지 요소의 값은 확실하므로 3번째부터 값을 고려하면 된다.
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];           // 칸의 수가 n일 때의 경우의 수
    }
}
