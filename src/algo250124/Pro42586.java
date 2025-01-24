package algo250124;

import java.util.*;

// 기능개발 - Lv2
public class Pro42586 {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        // 가변 배열 선언
        ArrayList<Integer> answer = new ArrayList<>();

        // progresses의 각 인덱스 값이 100을 넘는 최소일수를 담을 queue 선언
        Queue<Integer> queue = new LinkedList<>();

        int length = progresses.length;

        // (100 - 30) / 30 => 2
        for (int i = 0; i < length; i++) {
            queue.add((int)Math.ceil((100 - progresses[i]) / speeds[i]));
        }

        while (!queue.isEmpty()) {
            int mindays = queue.poll();
            int count = 1;                  // 해당일자에 배포되는 총 기능 수 세기 위한 변수

            while (!queue.isEmpty() && queue.peek() <= mindays) {
                queue.poll();
                count++;
            }
            answer.add(count);
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro42586 T = new Pro42586();
        System.out.println(T.solution(
            new int[]{95, 90, 99, 99, 80, 99},
            new int[]{1, 1, 1, 1, 1, 1}
        ));
    }

}
