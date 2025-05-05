package algo250505;

import java.io.*;
import java.util.*;

// 백준 - 수학적 호기심 (브론즈 3)
public class Baek9094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            // 0 < a < b < n, (a * a + b * b + m) / ab
            int count = 0;
            for (int a = 1; a < n; a++) {
                for (int b = a + 1; b < n; b++) {
                    if (((a * a) + (b * b) + m) % (a * b) == 0) {           // 나머지가 0이면 정수
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
