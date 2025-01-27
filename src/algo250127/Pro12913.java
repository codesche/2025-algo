package algo250127;

// 땅따먹기 - Lv2
public class Pro12913 {
    public int solution(int[][] land) {
        int answer = 0;
        int length = land.length;

        // 1부터 land의 길이까지 반복
        for (int i = 1; i < length; i++) {
            // 현재 행에 이전 행에서 현재 열과 다른 값 중 가장 큰 값을 찾아 더하기
            land[i][0] += maxNumber(land[i - 1][1], land[i - 1][2], land[i - 1][3]);
            land[i][1] += maxNumber(land[i - 1][0], land[i - 1][2], land[i - 1][3]);
            land[i][2] += maxNumber(land[i - 1][0], land[i - 1][1], land[i - 1][3]);
            land[i][3] += maxNumber(land[i - 1][0], land[i - 1][1], land[i - 1][2]);
        }

        // 마지막 행 최댓값 구하기
        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, land[land.length - 1][i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Pro12913 T = new Pro12913();
        System.out.println(T.solution(new int[][]
                {{1, 2, 3, 5},
                {5, 6, 7, 8},
                {4, 3, 2, 1}
                }));
    }

    // a, b, c 중 가장 큰 값을 반환하는 메서드
    public int maxNumber(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
