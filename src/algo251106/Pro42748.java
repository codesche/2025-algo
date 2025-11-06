package algo251106;

import java.util.Arrays;

// 프로그래머스 - K번째 수
public class Pro42748 {
    public int[] solution(int[] array, int[][] commands) {
        // 주어진 배열을 commands 배열에 주어진 조건에 맞춰서 자른다.
        int[] answer = new int[commands.length];
        int ansIdx = 0;

        for (int[] command : commands) {
            int start = command[0] - 1;     // 시작
            int end = command[1] - 1;       // 끝

            int length = end - start + 1;
            int[] data = new int[length];

            int idx = 0;                    // data 배열 인덱스
            for (int i = start; i <= end; i++) {
                data[idx++] = array[i];
            }

            // 정렬
            Arrays.sort(data);

            // k번째 숫자를 answer 배열에 추가
            answer[ansIdx++] = command[2] - 1;
        }

        return answer;
    }
}
