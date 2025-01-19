package algo250119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 과일 장수 - Lv1
public class Pro135808 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int num = score.length - 1;
        int length = score.length;
        List<Integer> list = new ArrayList<>();

        // 오름차순 정렬
        Arrays.sort(score);

        for (int j = 0; j < length / m; j++) {
            for (int n = 0; n < m; n++) {
                list.add(score[num]);
                num--;
            }

            // 가장 낮은 점수 p => 사과 한 상자 가격 p * m
            answer += m * Collections.min(list);
            list.clear();
        }
        return answer;
    }
}
