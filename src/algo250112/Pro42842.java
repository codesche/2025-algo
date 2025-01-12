package algo250112;

// 카펫 - Lv2
public class Pro42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;

        // yellow가 존재하려면 가로와 세로의 길이가 3이상 이어야 한다.
        for (int i = 3; i <= total; i++) {
            int col = i;                // 세로
            int row = total / col;      // 가로

            // 가로의 갯수가 3 이하일 경우 다음 인덱스
            if (row < 3) {
                continue;
            }

            // 가로는 세로의 길이보다 크거나 같다
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
