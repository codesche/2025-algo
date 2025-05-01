package algo250501;

import java.io.*;

// 백준 - 보너스 점수 (브론즈 2)
public class Baek17389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());        // 입력
        String s = br.readLine();

        int bonus = 0;
        int score = 0;
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == 'O') {
                score += i + 1;
                score += bonus;
                bonus++;
            } else if (s.charAt(i) == 'X') {
                bonus = 0;
            }
        }

        System.out.print(score);
    }
}
