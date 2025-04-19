package algo250419;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

// 백준 - 줄번호 (브론즈 4)
public class Baek4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            sb.append(i + 1).append(".").append(" ").append(input).append("\n");
        }

        System.out.print(sb);
    }
}
