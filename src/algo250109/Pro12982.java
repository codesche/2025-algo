package algo250109;

import java.util.Arrays;

// 예산 - Lv1 (최대 몇 개의 부서에 지원?!)
public class Pro12982 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int applyBudget : d) {
            if (budget - applyBudget < 0) {
                break;
            }
            budget -= applyBudget;
            answer++;
        }

        return answer;
    }
}
