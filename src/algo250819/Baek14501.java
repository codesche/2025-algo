package algo250819;

import java.io.*;
import java.util.*;

// 백준 - 퇴사 (실버 3)
// 예시: 1일, 4일, 5일 (10 + 20 + 15 = 45)
// 3	5	1	1	2	4	2
// 10	20	10	20	15	40	200
public class Baek14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] T = new int[N + 2];       // 1 - index [0 1 2 3 4 5 6 7 8 9]
        int[] P = new int[N + 2];       // 1 - index
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        // dp[i] = i일부터 시작해서 얻을 수 있는 최대 수익
        int[] dp = new int[N + 2];

        // 뒤에서 앞으로 계산 - (N + 1)일 = 사실상 제로 수익
        for (int i = N; i >= 1; i--) {
            int next = i + T[i];        // 이 상담을 끝낸 다음 날

            // 상담을 하지 않는 선택
            dp[i] = dp[i + 1];

            // 상담을 하는 선택
            // “오늘 일 안 하고 내일 보기” vs “오늘 시작해서 끝난 뒤의 최적값 + 보상” 중 큰 값.
            if (next <= N + 1) {
                dp[i] = Math.max(dp[i], P[i] + dp[next]);
            }
        }

        System.out.println(dp[1]);
    }
}
