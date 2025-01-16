package algo250116;

// 멀리 뛰기 - Lv2
public class Pro12914 {
    public long solution(int n) {
        long[] dp = new long[n + 2];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Pro12914 T = new Pro12914();
        System.out.println(T.solution(4));
    }

}
