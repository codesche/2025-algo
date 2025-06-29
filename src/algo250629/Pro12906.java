package algo250629;

import java.util.*;

// 프로그래머스 - 같은 숫자는 싫어 (Lv1)
public class Pro12906 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if (stack.isEmpty()) {
                stack.add(num);
            } else {
                if (num == stack.peek()) {
                    continue;
                } else {
                    stack.add(num);
                }
            }
        }

        int size = stack.size();

        int[] answer = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
