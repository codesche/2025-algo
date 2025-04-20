package algo250420;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

// 백준 - 배수 찾기 (브론즈 3)
public class Back4504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        while (true) {
            int value = Integer.parseInt(br.readLine());

            if (value == 0) {
                break;
            }

            if (value % N == 0) {
                sb.append(value).append(" is a multiple of ").append(N).append(".").append("\n");
            } else {
                sb.append(value).append(" is NOT a multiple of ").append(N).append(".").append("\n");
            }
        }

        System.out.print(sb);
    }
}
