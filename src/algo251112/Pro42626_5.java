package algo251112;

import java.util.*;

public class Pro42626_5 {
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

        // 우선순위 큐가 비어있지 않은 경우
        while (!pq.isEmpty()) {
            // 현재 최소가 K 이상이면 return
            if (pq.peek() >= K) {
                return answer;
            }

            // pq.size()가 2 미만인 경우 불가능
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
