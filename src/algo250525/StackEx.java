package algo250525;

import java.util.*;

// 스택 예제
public class StackEx {

    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;

                stack.pop();
            }
        }

        // 비어있으면 true
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String input = "(()())";
        System.out.println(isValidParentheses(input));
    }
}
