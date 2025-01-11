package algo250111;

import java.util.*;

// 짝지어 제거하기 - Lv2
// baabaa => bbaa => aa
public class Pro12973 {
    public int solution(String s) {
        // 문자를 저장하기 위한 스택
        Stack<Character> stack = new Stack<>();

        // 향상된 for문 활용
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);                      // 비어있으면 추가
            } else {
                if (stack.peek() == c) {            // stack에 맨 윗부분이 같으면 꺼내기
                    stack.pop();
                } else {
                    stack.push(c);                  // 다르면 stack에 추가하기
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;             // 스택의 비어있음 유무로 판단
    }

    public static void main(String[] args) {
        Pro12973 T = new Pro12973();
        System.out.println(T.solution("baabaa"));
    }
}
