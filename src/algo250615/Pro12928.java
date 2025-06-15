package algo250615;

import java.util.*;

// 프로그래머스 - 약수의 합 (Lv1)
public class Pro12928 {
    public int solution(int n) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).sum();

        return answer;
    }
}
