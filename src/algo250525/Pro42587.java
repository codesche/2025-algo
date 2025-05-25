package algo250525;

import java.util.*;

class Process2 {
    int priority;
    int index;

    public Process2(int priority, int index) {
        this.priority = priority;
        this.index = index;
    }
}

// 프로그래머스 - 프로세스 (Lv2)
public class Pro42587 {
    public int solution(int[] priorities, int location) {
        Queue<Process2> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Process2(priorities[i], i));
        }

        int order = 0;      // 위치 확인

        while (!queue.isEmpty()) {
            Process2 current = queue.poll();
            boolean hasHigherPriority = false;

            for (Process2 p : queue) {
                if (p.priority > current.priority) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.add(current);
            } else {
                order++;
                if (current.index == location) {
                    return order;
                }
            }
        }

        return -1;
    }
}
