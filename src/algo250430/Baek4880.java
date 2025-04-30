package algo250430;

import java.io.*;
import java.util.*;

// 백준 - 다음수 (브론즈 3)
public class Baek4880 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());

            if (a1 == 0 && a2 == 0 && a3 == 0) {
                break;
            }

            if ((a2 - a1) == (a3 - a2)) {
                int d = a2 - a1;
                sb.append("AP ").append(a3 + d).append("\n");
            } else {
                int d = a2 / a1;
                sb.append("GP ").append(a3 * d).append("\n");
            }
        }

        System.out.println(sb);
    }
}
