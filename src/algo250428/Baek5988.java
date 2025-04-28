package algo250428;

import java.io.*;

// 백준 - 홀수일까 짝수일까 (브론즈 3)
public class Baek5988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            sb.append(Integer.parseInt(input.substring(
                input.length() - 1)) % 2 == 0 ? "even\n" : "odd\n");
        }

        System.out.print(sb);
    }
}
