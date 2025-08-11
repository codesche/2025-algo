package algo250812;

import java.io.*;
import java.util.*;

// 균형잡힌 세상 - 실버 4
// Stack이나 Queue의 문제를 무조건 Stack, Queue로 풀 이유는 없다.
public class Baek4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String sentence = br.readLine();
            int length = sentence.length();

            if (sentence == null || sentence.equals(".")) break;
            Deque<Character> dq = new ArrayDeque<>();
            boolean isCheck = true;

            // 각 문자열이 균형을 이루고 있는지 확인
            // isCheck를 통해 균형을 이루고 있으면 true 아니면 false를 반환
            // length && isCheck -> false이면 더 이상 반복문을 돌지 않음 (break 대체 조건)
            for (int i = 0; i < length && isCheck; i++) {
                char ch = sentence.charAt(i);
                if (ch == '(' || ch == '[') {
                    dq.push(ch);
                } else if (ch == ')') {
                    isCheck = !dq.isEmpty() && dq.pop() == '(';
                } else if (ch == ']') {
                    isCheck = !dq.isEmpty() && dq.pop() == '[';
                }
            }
            // yes or no 추가 (덱이 비어 있으면 균형이라는 의미)
            sb.append(isCheck && dq.isEmpty() ? "yes" : "no").append('\n');
        }
        System.out.print(sb);
    }
}
