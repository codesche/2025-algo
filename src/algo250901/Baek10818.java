package algo250901;

import java.io.*;
import java.util.*;

// 백준 - 최소, 최대 (브론즈 3)
public class Baek10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (x < min) {
                min = x;
            }

            if (x > max) {
                max = x;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min).append(' ').append(max);
        System.out.print(sb.toString());
    }
}
