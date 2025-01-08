package algo250108;

import java.util.*;

// 같은 숫자는 싫어
public class Pro12906 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int temp = -1;          // 배열의 첫 번째 요소가 0일 수도 있기 때문에 -1로 설정

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

    public static void main(String[] args) {
        Pro12906 T = new Pro12906();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 1, 3, 3, 0, 0, 1})));
    }

}
