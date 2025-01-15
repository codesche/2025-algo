package algo250115;

import java.util.Arrays;

// 로또의 최고 순위와 최저 순위 - Lv1
public class Pro77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int[] answer = new int[2];

        // 로또 배열과 당첨 번호 배열 비교
        for (int lotto : lottos) {
            // 0인 것들은 당첨 번호로 가정
            if (lotto == 0) {
                answer[0]++;
            }

            for (int winNum : win_nums) {
                // 일치하는 번호가 있는 경우 최고 순위와 최저 순위 모두 증가
                if (lotto == winNum) {
                    answer[0]++;
                    answer[1]++;
                }
            }
        }
        answer[0] = rank[answer[0]];
        answer[1] = rank[answer[1]];

        return answer;
    }

    public static void main(String[] args) {
        Pro77484 T = new Pro77484();
        System.out.println(Arrays.toString(T.solution(
            new int[]{44, 1, 0, 0, 31, 25},
            new int[]{31, 10, 45, 1, 6, 19}
        )));
    }

}
