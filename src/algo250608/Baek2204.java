package algo250608;

import java.util.*;
import java.io.*;

// 백준 - 도비의 난독증 테스트 (브론즈 1)
public class Baek2204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int T = Integer.parseInt(br.readLine());

            if (T == 0) {
                break;
            }

            String[] words = new String[T];

            for (int i = 0; i < T; i++) {
                words[i] = br.readLine();
            }

            Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);  // 대소문자 구분하지 않기 위해 String.CASE_INSENSITIVE_ORDER 활용
            sb.append(words[0]).append("\n");
        }

        System.out.println(sb);
    }
}
