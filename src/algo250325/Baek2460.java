package algo250325;

import java.io.*;
import java.util.*;

// 백준 - 지능형 기차 2 (브론즈 3)
public class Baek2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int off = Integer.parseInt(st.nextToken());         // 내린 사람 수
            int ride = Integer.parseInt(st.nextToken());        // 타는 사람 수

            if (off == 0) {
                total += ride;
            } else {
                total = total - off + ride;
            }

            if (max < total) {
                max = total;
            }
        }
        System.out.print(max);
    }
}
