package algo250308;

import java.util.*;

// 같은 숫자는 싫어 - Lv1

public class Pro12906_2 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int temp = -1;

        for (int value : arr) {
            if (value != temp) {
                stack.push(value);
                temp = value;
            }
        }

        int answerLength = stack.size();
        int[] answer = new int[answerLength];

        for (int i = answerLength - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
