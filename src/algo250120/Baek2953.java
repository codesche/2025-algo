package algo250120;

import java.io.*;
import java.util.*;

// 나는 요리사다 - 브론즈 3
public class Baek2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;        // 가장 높은 점수
        int num = 0;        // 우승자 번호

        for (int i = 1; i <= 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int sum = 0;

            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }

            if (sum > max) {
                max = sum;
                num = i;
            }
        }
        System.out.print(num + " " + max);
    }
}
