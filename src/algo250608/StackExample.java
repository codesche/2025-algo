package algo250608;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // 1. Stack 생성
        Stack<String> myStack = new Stack<>();
        System.out.println("초기 스택 상태: " + myStack);
        System.out.println("스택이 비어있나요? " + myStack.empty());        // true
        System.out.println("-------------------------------------");

        // 2. push() 메서드를 사용하여 요소 추가
        System.out.println("요소 'Apple' 푸시...");
        myStack.push("Apple");
        System.out.println("현재 스택: " + myStack);

        System.out.println("요소 'Banana' 푸시...");
        myStack.push("Banana");
        System.out.println("현재 스택: " + myStack);

        System.out.println("요소 'Cherry' 푸시...");
        myStack.push("Cherry");
        System.out.println("현재 스택: " + myStack);
        System.out.println("스택이 비어있나요? " + myStack.empty());        // false
        System.out.println("-------------------------------------");

        // 3. peek() 메서드를 사용하여 맨 위 요소 확인
        try {
            String topElement = myStack.peek();
            System.out.println("맨 위 요소 (peek): " + topElement);         // Cherry
            System.out.println("peek 후 스택 상태: " + myStack);
        } catch (EmptyStackException e) {
            System.out.println("스택이 비어있어서 peek 할 수 없습니다.");
        }
        System.out.println("-------------------------------------");

        // 4. pop() 메서드를 사용하여 요소 제거
        try {
            String poppedElement1 = myStack.pop();
            System.out.println("팝된 요소: " + poppedElement1);
            System.out.println("pop 후 스택 상태: " + myStack);

            String poppedElement2 = myStack.pop();
            System.out.println("팝된 요소: " + poppedElement2);
            System.out.println("pop 후 스택 상태: " + myStack);
        } catch (EmptyStackException e) {
            System.out.println("스택이 비어있어서 pop 할 수 없다.");
        }
        System.out.println("-------------------------------------");

        // 5. search() 메서드를 사용하여 요소 검색
        System.out.println("'Apple'의 위치: " + myStack.search("Apple"));                              // 1 (스택의 맨 위에서부터 1부터 시작)
        System.out.println("'Banana'의 위치 (현재 스택에 없음): " + myStack.search("Banana"));         // -1
        System.out.println("-------------------------------------");

        // 6. 스택의 모든 요소 비우기
        System.out.println("스택의 모든 요소 팝: ");
        while (!myStack.empty()) {
            System.out.println("팝된 요소: " + myStack.pop());
        }

        System.out.println("최종 스택 상태: " + myStack);                   // []
        System.out.println("스택이 비어있나요? " + myStack.empty());        // true
        System.out.println("-------------------------------------");

        // 7. 빈 스택에서 pop/peek 시도 (EmptyStackException 발생 예시)
        try {
            myStack.pop();
        } catch (EmptyStackException e) {
            System.out.println("오류: 빈 스택에서 pop 시도! (EmptyStackException 발생)");
        }
    }
}
