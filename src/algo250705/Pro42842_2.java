package algo250705;

// 프로그래머스 - 카펫 (Lv2), 다른 풀이
// 핵심 포인트 - 노란색의 경우 갯수와 넓이가 같다
public class Pro42842_2 {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        // Math.sqrt 사용하여 연산 수 줄임
        for (int row = 3; row <= Math.sqrt(total); row++) {
            if (total % row == 0) {
                int col = total / row;

                if ((col - 2) * (row - 2) == yellow) {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }
}
