package algo250723;

import java.util.Arrays;

// 프로그래머스 - K번째 수 (Lv1)
public class Pro42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int ansIdx = 0;         // answer 배열 인덱스 자동 증가

        for (int[] command : commands) {
            int start = command[0] - 1;
            int end = command[1] - 1;

            int idx = 0;        // 정렬할 배열 인덱스 자동 증가
            int[] data = new int[end - start + 1];
            for (int i = start; i <= end; i++) {
                data[idx++] = array[i];
            }

            // data 배열 정렬
            Arrays.sort(data);

            // answer 배열에 추가
            answer[ansIdx++] = data[command[2] - 1];
        }

        return answer;
    }
}
