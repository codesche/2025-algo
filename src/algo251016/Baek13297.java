package algo251016;

import java.io.*;

// 백준 - Quick Estimates (브론즈 4)
public class Baek13297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim()); // 테스트 케이스 수
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String cost = br.readLine().trim(); // 매우 큰 수 (문자열 그대로)
            sb.append(cost.length()).append("\n"); // 자릿수 출력
        }

        System.out.print(sb);

    }
}
