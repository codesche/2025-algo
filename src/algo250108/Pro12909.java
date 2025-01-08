package algo250108;

import java.util.*;

// 올바른 괄호
public class Pro12909 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
