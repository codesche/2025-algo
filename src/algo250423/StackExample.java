package algo250423;

import java.util.Stack;

// Stack은 후입선출(LIFO) 구조로, 주로 재귀적인 문제를 해결할 때 사용
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());        // C
        System.out.println(stack.pop());        // B
    }
}
