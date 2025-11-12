package algo251112;

import java.util.*;

public class Pro42626_3 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // scovillle 지수를 우선순위 큐에 추가
        for (int number : scoville) {
            pq.offer(number);
        }

        // 모든 음식이 K 이상이면 바로 종료 (1개만 있을 때)
        if (!pq.isEmpty() && pq.peek() >= K) {
            return 0;
        }

        while (!pq.isEmpty()) {
            // 현재 최소가 K 이상이면 끝
            if (pq.peek() >= K) {
                return answer;
            }

            // 2개 이하이면 섞을 수 없음
            if (pq.size() < 2) {
                return -1;
            }

            int first = pq.poll();
            int second = pq.poll();

            // 조건 충족
            int mixed = first + (second * 2);
            pq.offer(mixed);
            answer++;
        }

        // 예외 처리
        return -1;
    }
}
