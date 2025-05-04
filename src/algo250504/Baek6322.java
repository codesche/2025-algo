package algo250504;

import java.io.*;
import java.util.*;

// 백준 - 직각 삼각형의 두 변 (브론즈 3)
public class Baek6322 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double answer = 0;
        int count = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (c == -1) {
                answer = Math.sqrt(Math.pow(b, 2) + Math.pow(a, 2));
                sb.append("Triangle ").append("#").append(count).append("\n");
                sb.append(String.format("c = %.3f\n\n", answer));
            } else if (a == -1 && b < c) {
                answer = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
                sb.append("Triangle ").append("#").append(count).append("\n");
                sb.append(String.format("a = %.3f\n\n", answer));
            } else if (b == -1 && a < c) {
                answer = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
                sb.append("Triangle ").append("#").append(count).append("\n");
                sb.append(String.format("b = %.3f\n\n", answer));
            } else {
                sb.append("Triangle ").append("#").append(count).append("\n");
                sb.append("Impossible.\n\n");
            }
            count++;
        }

        System.out.print(sb);
    }
}
