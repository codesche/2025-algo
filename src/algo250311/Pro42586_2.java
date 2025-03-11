package algo250311;

// 기능개발 - Lv2, Queue 사용

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pro42586_2 {
    public int[] solution(int[] progresses, int[] speeds) {
        // progresses의 각 인덱스 값이 100을 넘는 최소일수를 담을 queue 선언
        Queue<Integer> queue = new LinkedList<>();
        int length = progresses.length;

        // (100 - 30) / 30 => 2
        for (int i = 0; i < length; i++) {
            queue.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
        }

        List<Integer> answer = new ArrayList<>();
        while (!queue.isEmpty()) {
            int day = queue.poll();
            int cnt = 1;            // 해당일자에 배포되는 총 기능 수 세기 위한 변수

            while (!queue.isEmpty() && day >= queue.peek()) {
                cnt++;
                queue.poll();
            }

            answer.add(cnt);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
