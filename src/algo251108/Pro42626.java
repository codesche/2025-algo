package algo251108;

import java.util.*;

// 프로그래머스 - 더 맵게 (Lv2)

/**
 상황: 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶음.

 조건:
 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

 목표: 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수

 예외: 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우엔 -1을 return

 */

public class Pro42626 {
    public int solution(int[] scoville, int K) {
        // 1. scoville 지수를 우선순위에 추가
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int number : scoville) {
            pq.offer(number);
        }

        // 모든 음식이 K 이상일 경우 바로 종료
        if (!pq.isEmpty() && pq.peek() >= K) {
            return 0;
        }

        // 2. 모두 K 이상으로 변경 후 answer 리턴
        // K 이상으로 만들 수 없는 경우 -1 리턴
        while (!pq.isEmpty()) {
            // 현재 최소가 K 이상이면 끝
            if (pq.peek() >= K) {
                return answer;
            }

            if (pq.size() < 2) {
                return -1;
            }

            int first = pq.poll();
            int second = pq.poll();

            int mixed = first + (second * 2);
            pq.offer(mixed);
            answer++;
        }

        return -1;
    }
}
