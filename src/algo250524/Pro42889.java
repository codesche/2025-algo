package algo250524;

import java.util.*;

// 프로그래머스 - 실패율 (Lv1)
public class Pro42889 {
    public int[] solution(int N, int[] stages) {
        // 스테이지별 도전자 수 구하기
        int[] challenger = new int[N + 2];
        for (int i = 0; i < stages.length; i++) {
            challenger[stages[i]] += 1;
        }

        // 스테이지별 실패한 사용자 수 계산
        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length;

        // 각 스테이지를 순회하며, 실패율 계산
        for (int i = 1; i <= N; i++) {
            if (challenger[i] == 0) {                   // 도전한 사람 없는 경우, 실패율은 0
                fails.put(i, 0.);
            } else {
                fails.put(i, challenger[i] / total);    // 실패율 구함
                total -= challenger[i];                 // 다음 스테이지 실패율 구하기 위해 현재 스테이지 인원 뺌
            }
        }

        // 실패율이 높은 스테이지부터 내림차순으로 정렬
        return fails.entrySet().stream().sorted((o1, o2) -> Double.compare(
            o2.getValue(), o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
    }

    public static void main(String[] args) {
        Pro42889 T = new Pro42889();
        System.out.println(Arrays.toString(T.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
    }

}
