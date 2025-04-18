package algo250118;

import java.util.*;

// 괄호 회전하기 - Lv2
public class Pro76502 {
    public int solution(String s) {
        int answer = 0;

        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i + 1);
            queue.add(str);
        }

        for (int i = 0; i < s.length(); i++) {
            String firstStr = queue.poll();
            queue.add(firstStr);

            Stack<String> stack = new Stack<>();

            // stack에 전부 넣기
            for (int j = 0; j < s.length(); j++) {
                String waitingStr = queue.poll();
                queue.add(waitingStr);

                if (stack.isEmpty()) {
                    stack.push(waitingStr);
                } else if (waitingStr.equals(")") && stack.peek().equals("(")) {
                    stack.pop();
                } else if (waitingStr.equals("]") && stack.peek().equals("[")) {
                    stack.pop();
                } else if (waitingStr.equals("}") && stack.peek().equals("{")) {
                    stack.pop();
                } else {
                    stack.push(waitingStr);
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Pro76502 T = new Pro76502();
        System.out.println(T.solution("[](){}"));
    }
}
