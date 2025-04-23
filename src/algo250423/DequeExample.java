package algo250423;

import java.util.ArrayDeque;
import java.util.Deque;

// 데크는 양쪽 끝에서 삽입과 삭제가 가능한 큐이다. 보통 ArrayDeque로 구현된다.
public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("First");
        deque.addLast("Last");

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
