package algo250303;

import java.util.Stack;

// Stack 예제
// 순차적으로 데이터를 접근하면서, 이전 데이터와 신규 데이터가 같을 때 연산이 이루어지는 문제에서 사용
// 중복 허용
public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        if (stack.isEmpty()) {
            stack.push(1);
            stack.push(2);
            stack.push(3);
        }

        if (!stack.empty()) {
            if (stack.peek() == 3) {
                stack.pop();
            }
        }

        if (stack.search(3) == -1){
            System.out.println("3 is poped");
        }
    }
}
