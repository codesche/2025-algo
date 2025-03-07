package algo250307;

import java.util.*;

// K번째수 - Lv1
public class Pro42748 {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();

        // 배열 순회
        for (int[] command : commands) {
            int start = command[0] - 1;             // 배열은 0부터 시작하므로
            int end = command[1] - 1;

            int[] temp = new int[end - start + 1];
            int idx = 0;
            for (int j = start; j <= end; j++) {
                temp[idx++] = array[j];
            }

            Arrays.sort(temp);
            list.add(temp[command[2] - 1]);
        }

        int size = list.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro42748 T = new Pro42748();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 5, 2, 6, 3, 7, 4},
            new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }

}
