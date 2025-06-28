package algo250628;

import java.util.*;

// 프로그래머스 - 작은 수 제거하기 (Lv1)
public class Pro12935 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {          // 배열 길이가 1이면 그냥 -1은 리턴
            return new int[]{-1};
        }

        int[] answer = new int[arr.length - 1];
        int min = Arrays.stream(arr).min().getAsInt();

        int idx = 0;
        for (int num : arr) {
            if (num > min) {
                answer[idx++] = num;
            }
        }

        return answer;
    }
}
