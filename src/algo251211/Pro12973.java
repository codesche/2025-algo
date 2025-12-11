package algo251211;

import java.util.*;

// 프로그래머스 - 짝지어 제거하기
// Deque를 통해 Stack을 구현
public class Pro12973 {
    public int solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
