package algo250504;

import java.io.*;
import java.util.StringTokenizer;

// 백준 - 고급 수학 (브론즈 3)
public class Baek7510 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if ((a * a) + (b * b) == c * c || (a * a) + (c * c) == b * b
            || (b * b) + (c * c) == a * a) {
                sb.append("Scenario #").append(i + 1).append(":").append("\n").append("yes");
                sb.append("\n").append("\n");
            } else {
                sb.append("Scenario #").append(i + 1).append(":").append("\n").append("no");
                sb.append("\n").append("\n");
            }
        }

        System.out.print(sb);
    }
}
