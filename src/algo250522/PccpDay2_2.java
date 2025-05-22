package algo250522;

import java.util.*;

// PCCP 기출문제 - 퍼즐 게임 챌린지
// 이분 탐색 이용, level 최소값 구하기 (시작 값은 1로 고정, 끝 값은 배열에서 최대값)
// mid 값이 곧 level
// 결과 값이 limit을 초과하면 level이 더 커야하므로, 이분 탐색에서 start = mid + 1
// 결과 값이 limit보다 작으면 level이 더 작아질 수 있으므로, 이분 탐색에서 end = mid - 1
// diffs와 times의 길이가 300,000이고 diff의 최대 값은 100,000 이므로 시간 복잡도는 최대 300,000 * log(100,000)
// 즉, 300,000 * 16.6 < 5,000,000이 넘지 않으므로 충분함
public class PccpDay2_2 {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 100001;
        int start = 1;
        int end = Arrays.stream(diffs).max().orElseThrow();

        while (start <= end) {
            int mid = (start + end) / 2;
            if (isClear(diffs, times, limit, mid)) {
                end = mid - 1;
                answer = Math.min(answer, mid);
                continue;
            }
            start = mid + 1;
        }

        return answer;
    }

    public boolean isClear(int[] diffs, int[] times, long limit, int level) {
        long totalTime = times[0];
        int prevTime = times[0];

        for (int i = 1; i < diffs.length; i++) {
            if (diffs[i] > level) {
                totalTime += (long) (diffs[i] - level) * (times[i] + prevTime) + times[i];
            } else if (diffs[i] <= level) {
                totalTime += times[i];
            }

            if (totalTime > limit) {
                return false;
            }

            prevTime = times[i];
        }

        return true;
    }


    public static void main(String[] args) {
        PccpDay2_2 T = new PccpDay2_2();
        System.out.println(T.solution(new int[]{1, 5, 3}, new int[]{2, 4, 7}, 30));
    }
}
