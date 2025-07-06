package algo250706;

import java.util.*;

// 프로그래머스 - 구명보트 (Lv2), 다른 풀이 - 데크 활용
public class Pro42885_3 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);            // 정렬

        Deque<Integer> deque = new ArrayDeque<>();
        for (int p : people) {
            deque.push(p);
        }

        int answer = 0;                     // 보트 수
        while (!deque.isEmpty()) {
            if (deque.size() == 1) {        // 데크 사이즈가 1이면 루프 빠져나옴
                answer++;
                break;
            }

            if (deque.peekFirst() + deque.peekLast() <= limit) {        // 데크의 앞과 끝의 요소로 무게 제한 조건 고려
                deque.pollFirst();
            }

            deque.pollLast();           // 만약에 조건을 만족하지 않을 경우 한명만 태운다.
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro42885_3 p = new Pro42885_3();
        System.out.println(p.solution(new int[]{70, 80, 50}, 100));
    }
}
