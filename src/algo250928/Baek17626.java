package algo250928;

import java.io.*;

// 백준 - Four Squares (실버 3), [14404 KB, 100 ms]
public class Baek17626 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 결과 계산 및 출력
        int result = fourSquares(n);
        System.out.println(result);

        br.close();
    }

    // 브루트포스 방법으로 Four Squares 문제 해결
    private static int fourSquares(int n) {
        // 1개의 제곱수로 표현 가능한지 여부 확인
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            return 1;
        }

        // 2개의 제곱수로 표현 가능한지 확인
        for (int i = 1; i * i <= n; i++) {
            int remain = n - i * i;
            int sqrtRemain = (int) Math.sqrt(remain);
            if (sqrtRemain * sqrtRemain == remain) {
                return 2;
            }
        }

        // 3개의 제곱수로 표현 가능한지 확인
        for (int i = 1; i * i <= n; i++) {
            for (int j = 1; i * i + j * j <= n; j++) {
                int remain = n - i * i - j * j;
                int sqrtRemain = (int) Math.sqrt(remain);
                if (sqrtRemain * sqrtRemain == remain) {
                    return 3;
                }
            }
        }

        // 모든 자연수는 최대 4개로 표현 가능
        return 4;
    }
}
