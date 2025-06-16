package algo250616;

import java.util.Arrays;

// 프로그래머스 - 평균 구하기 (Lv1)
public class Pro12944 {
    public double solution(int[] arr) {
        double answer = 0;

        answer = Arrays.stream(arr).average().orElse(0);

        return answer;
    }
}
