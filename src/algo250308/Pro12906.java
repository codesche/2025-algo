package algo250308;

import java.util.*;

// 같은 숫자는 싫어 - Lv1 (continue 활용)
public class Pro12906 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (!stack.isEmpty() && arr[i - 1] == arr[i]) {
                continue;
            } else {
                stack.push(arr[i]);
            }
        }


        int size = stack.size();
        int[] answer = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro12906 T = new Pro12906();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 1, 3, 3, 0, 0, 1})));
    }

}
