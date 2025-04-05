package algo250405;

import java.io.*;
import java.util.*;

// 백준 - 배수와 약수 (브론즈 3)
public class Baek5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            if (first == 0 && second == 0) {
                break;
            }

            if (second % first == 0) {
                sb.append("factor").append("\n");
            } else if (first % second == 0) {
                sb.append("multiple").append("\n");
            } else if (second % first != 0 && first % second != 0) {
                sb.append("neither").append("\n");
            }
        }

        System.out.print(sb);
    }
}
