package algo250723;

import java.util.*;

// 프로그래머스 - K번째 수 (Lv1)
public class Pro42748_2 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        // Arrays.copyOfRange 활용하여 깔끔하게 처리
        for (int i = 0; i < answer.length; i++) {
            int[] data = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1] - 1);

            Arrays.sort(data);

            answer[i] = data[commands[i][2] - 1];
        }

        return answer;
    }
}
