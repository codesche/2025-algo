package algo250325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

// 백준 - 짝수를 찾아라 (브론즈 3)
public class Baek3058_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // t번 순회
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int sum = 0;

            int min = Integer.MAX_VALUE;
            for (int j = 0; j < 7; j++) {
                int num = Integer.parseInt(st.nextToken());

                // 짝수 구분 후 누적 합 구하기
                if (num % 2 == 0) {
                    sum += num;
                }

                if (min > num && num % 2 == 0) {
                    min = num;
                }
            }

            System.out.println(sum + " " + min);
        }
    }

}
