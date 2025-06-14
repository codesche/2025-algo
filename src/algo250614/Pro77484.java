package algo250614;

public class Pro77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int[] answer = new int[2];

        for (int lotto : lottos) {
            // 0인 것들은 당첨 번호로 가정
            if (lotto == 0) {
                answer[0]++;
            }

            for (int winNum : win_nums) {
                // 일치하는 번호가 있는 경우 최고 순위, 최저 순위 모두 증가
                if (lotto == winNum) {
                    answer[0]++;
                    answer[1]++;
                    break;
                }
            }
        }

        answer[0] = rank[answer[0]];
        answer[1] = rank[answer[1]];

        return answer;
    }
}
