package algo250426;

import java.util.Stack;

// 괄호 회전
public class CoTeEx3_refactor {
    public int solution(String s) {
        int answer = 0;

        // 문자열을 회전시키며 확인
        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);    // 회전된 문자열 만들기
            if (isValid(rotated)) {
                answer++;
            }
        }

        return answer;
    }

    // 올바른 괄호 문자열인지 확인하는 함수
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 열린 괄호는 스택에 넣기
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;       // 유효하지 않은 괄호
            }
        }

        return stack.isEmpty();     // 모든 괄호가 짝을 맞추었으면 스택이 비어있어야 함
    }

    public static void main(String[] args) {
        CoTeEx3_refactor T = new CoTeEx3_refactor();
        System.out.println(T.solution("{}[]"));
    }
}
