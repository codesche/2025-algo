package algo250814;

import java.io.*;
import java.util.*;

// 백준 - solved.ac (실버 4)
// 위에서 15%, 아래에서 15% => 8개
public class Baek18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.println("0");
        } else {
            int[] opinions = new int[n];
            for (int i = 0; i < n; i++) {
                opinions[i] = Integer.parseInt(br.readLine());
            }

            // 정렬
            Arrays.sort(opinions);

            // 절사평균 범위 정하기
            // 1 5 5 7 8
            float tempValue = Math.round(n * 0.15);
            int k = (int) tempValue;

            int sum = 0;
            for (int i = k; i < n - k; i++) {
                sum += opinions[i];
            }

            float answer = ((float) sum / (n - (k * 2)));
            System.out.println(Math.round(answer));
        }

    }
}
