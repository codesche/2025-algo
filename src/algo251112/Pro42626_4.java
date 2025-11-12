package algo251112;

/**
 * 상황:
 * 조건:
 * 목표:
 * 예외:
 * 접근:
 */

import java.util.*;

public class Pro42626_4 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // scoville 지수를 우선순위 큐에 추가
        for (int number : scoville) {
            pq.offer(number);
        }

        // 모든 음식이 K 이상이면 바로 종료
        if (!pq.isEmpty() && pq.peek() >= K) {
            return 0;
        }

        while (!pq.isEmpty()) {
            // K 이상인 경우 return answer
            if (pq.peek() >= K) {
                return answer;
            }

            // pq.size() < 2 => K 이상으로 만들 수 없는 경우
            if (pq.size() < 2) {
                return -1;
            }

            int first = pq.poll();
            int second = pq.poll();

            int mixed = first + (second * 2);
            pq.offer(mixed);
            answer++;
        }

        // 예외 처리
        return -1;
    }
}
