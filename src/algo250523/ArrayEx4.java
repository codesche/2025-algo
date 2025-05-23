package algo250523;

import java.sql.Array;
import java.util.*;

// 모의고사 - 프로그래머스 (Lv1)
// 1번 : 1, 2, 3, 4, 5
// 2번 : 2, 1, 2, 3, 2, 4, 2, 5
// 3번 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
// 가장 많은 문제를 맞힌 사람
public class ArrayEx4 {
    public int[] solution(int[] answers) {
        // 수포자들의 패턴
        int[][] pattern = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        // 수포자 저장 배열
        int[] scores = new int[3];

        // 각 수포자 패턴과 정답이 일치하는지 여부 확인
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (answers[i] == pattern[j][i % pattern[j].length]) {
                    scores[j]++;
                }
            }
        }

        // 가장 높은 점수 저장
        int maxScore = Arrays.stream(scores).max().getAsInt();

        // 가장 높은 점수를 가진 수포자들의 번호를 찾아서 리스트에 담음
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        ArrayEx4 T = new ArrayEx4();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 3, 2, 4, 2})));
    }
}
