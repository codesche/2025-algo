package algo250911;

import java.io.*;

// 백준 - 1로 만들기 (실버 3)
public class Baek1463 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        int N = Integer.parseInt(br.readLine());

        // dp 배열 생성
        int[] dp = new int[N + 1];

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2]);
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3]);
            }
        }

        System.out.println(dp[N]);
    }

}
