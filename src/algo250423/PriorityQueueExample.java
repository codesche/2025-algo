package algo250423;

import java.util.PriorityQueue;

// PriorityQueue는 우선순위 큐로, 요소가 우선순위에 따라 정렬된다.
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
