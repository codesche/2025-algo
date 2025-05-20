package algo250520;

// 프로그래머스 - 카펫 (Lv2)
public class Pro42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;

        // yellow 가 존재하려면 가로와 세로의 길이가 3 이상이어야 한다
        for (int i = 3; i <= total; i++) {
            int col = i;                // 세로
            int row = total / col;      // 가로

            // 가로의 갯수가 3 이하일 경우
            if (row < 3) {
                continue;
            }

            // 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 길다.
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
