package algo250705;

// 프로그래머스 - 카펫 (Lv2)
// 핵심 포인트 - 노란색의 경우 갯수와 넓이가 같다
public class Pro42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;

        for (int i = 3; i <= total; i++) {
            int col = i;
            int row = total / col;

            if (row < 3) {
                continue;
            }

            if (row >= col) {
                if ((row - 2) * (col - 2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }
        }

        return answer;
    }
}
