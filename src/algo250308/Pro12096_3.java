package algo250308;

import java.util.*;

// 스택만 활용하여 풀이
public class Pro12096_3 {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }

        return stack;
    }
}
