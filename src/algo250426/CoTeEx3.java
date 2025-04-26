package algo250426;

import java.util.Stack;

// 괄호 회전
public class CoTeEx3 {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char spell = s.charAt(i);
            stack.push(spell);
            if (spell == ']') {
                stack.pop();
                answer++;
            } else if (spell == ')') {
                stack.pop();
                answer++;
            } else if (spell == '}') {
                stack.pop();
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CoTeEx3 T = new CoTeEx3();
        System.out.println(T.solution("{}[]"));
    }
}
