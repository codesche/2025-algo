package algo250423;

import java.util.LinkedList;
import java.util.Queue;

// Queue는 선입선출(FIFO) 구조로, 순차적으로 요소를 처리하는데 사용된다.
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println(queue.poll());           // First
        System.out.println(queue.poll());           // Second
    }
}
