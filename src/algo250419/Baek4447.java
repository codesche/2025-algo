package algo250419;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

// 백준 - 좋은놈 나쁜놈 (브론즈 2)
// 'g'의 개수와 'b'의 개수만 센다. - 'g'가 더 많으면 좋은 놈, 'b'가 더 많으면 나쁜 놈
// 'g'의 개수와 'b'의 개수가 같으면 중립
public class Baek4447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            int gCount = 0;
            int bCount = 0;

            for (char c : input.toCharArray()) {
                if (c == 'g' || c == 'G') {
                    gCount++;
                } else if (c == 'b' || c == 'B') {
                    bCount++;
                }
            }

            if (gCount > bCount) {
                sb.append(input).append(" is ").append("GOOD").append("\n");
            } else if (gCount < bCount) {
                sb.append(input).append(" is ").append("A BADDY").append("\n");
            } else {
                sb.append(input).append(" is ").append("NEUTRAL").append("\n");
            }
        }

        System.out.print(sb);
    }
}
