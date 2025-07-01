package algo250702;

import java.util.*;

// 프로그래머스 - 올바른 괄호 (Lv2)
public class Pro12909 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {      // 만약에 '())' 인 경우 어차피 맞지 않기 때문에 false 출력
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
