package algo250905;

import java.io.*;
import java.util.*;

// 백준 - 괄호 (실버 4)
public class Baek9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            // 덱 선언
            Deque<Character> stack = new ArrayDeque<>();

            // 유효성 검증
            boolean isValid = true;

            int length = s.length() - 1;

            int idx = 0;
            while (length-- >= 0) {
                // 판별할 문자
                char ch = s.charAt(idx++);

                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }

            // 최종 고려
            if (isValid && stack.isEmpty()) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }

        System.out.print(sb);
    }
}
