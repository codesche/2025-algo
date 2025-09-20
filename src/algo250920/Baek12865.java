package algo250920;

import java.io.*;
import java.util.*;

// 백준 - 평범한 배낭 (골드 5)
// 배낭에 넣을 수 있는 물건들 가치합의 최댓값
public class Baek12865 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 물품의 수, 준서가 버틸 수 있는 무게
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 1차원 DP
        int[] dp = new int[K + 1];

        // 두 번째 줄
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int W = Integer.parseInt(st.nextToken());       // 물건의 무게
            int V = Integer.parseInt(st.nextToken());       // 물건의 가치

            // 버틸 수 있는 무게가 K 인데 K를 넘어서는 것들은 가치를 고려하지 않는다.
            // 순차적으로 무게를 더했을 때 K를 넘어선다면 범위를 조정해야 한다.

            // 같은 물건을 중복으로 사용하지 않도록 역순으로 조회
            for (int j = K; j >= W; j--) {
                dp[j] = Math.max(dp[j], dp[j - W] + V);
            }
        }

        System.out.println(dp[K]);
    }

}
