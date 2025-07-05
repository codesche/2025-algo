package algo250705;

import java.util.Stack;

// 프로그래머스 - 짝지어 제거하기 (Lv2)
public class Pro12973 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

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
