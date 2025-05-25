package algo250525;

import java.util.*;

// 큐 예제 - 프린터 큐
// 프로세스가 요청된 순서대로 큐에 들어오고, 특정 우선순위가 있는 경우 높은 우선순위부터 처리된다고 할 때,
// 특정 프로세스가 몇 번째로 실행되는지 구하세요.
class Process {     // 각 문서의 우선순위와 위치를 기억하여 Queue에 담기 위해 만들어짐
    int priority;
    int index;

    public Process(int priority, int index) {
        this.priority = priority;
        this.index = index;
    }
}

public class QueueEx {

    public static int getProcessOrder(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();          // 객체형 Queue 생성

        for (int i = 0; i < priorities.length; i++) {       // 큐에 객체 추가 (FIFO)
            queue.add(new Process(priorities[i], i));
        }

        int order = 0;

        while (!queue.isEmpty()) {
            Process current = queue.poll();             // 문서 하나 꺼냄
            boolean hasHigherPriority = false;

            for (Process p : queue) {
                if (p.priority > current.priority) {    // 뒤쪽에 우선순위 높은 문서가 있는지 확인
                    hasHigherPriority = true;           // 우선순위 true로 변경
                    break;
                }
            }

            if (hasHigherPriority) {    // 높은 우선순위가 있다면
                queue.add(current);     // 다시 뒤로 보냄
            } else {                    // 그렇지 않다면
                order++;                // 인쇄 완료 (order++)
                if (current.index == location) {        // 내가 찾고 있는 문서인지 확인 -> 맞으면 리턴
                    return order;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(getProcessOrder(priorities, location));  // 출력: 1
    }

}
