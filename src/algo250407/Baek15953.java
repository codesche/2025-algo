package algo250407;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 - 상금 헌터 (브론즈 3)
public class Baek15953 {
    // 첫 번째 대회 상금 테이블 (순위 범위별 인원 수와 상금)
    private static final int[] FIRST_COMPETITION_PRIZES = {500, 300, 200, 50, 30, 10};
    private static final int[] FIRST_COMPETITION_RANKS = {1, 2, 3, 4, 5, 6};

    // 두 번째 대회 상금 테이블 (순위 범위별 인원 수와 상금)
    private static final int[] SECOND_COMPETITION_PRIZES = {512, 256, 128, 64, 32};
    private static final int[] SECOND_COMPETITION_RANKS = {1, 2, 4, 8, 16};

    // 배열의 길이
    private static final int FIRST_LENGTH = FIRST_COMPETITION_RANKS.length;
    private static final int SECOND_LENGTH = SECOND_COMPETITION_RANKS.length;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            answer = (firstCompetition(a) + secondCompetition(b)) * 10000;
            sb.append(answer).append("\n");
        }

        br.close();
        System.out.print(sb);
    }

    private static int firstCompetition(int rank) {
        if (rank == 0) return 0;
        int limit = 0;
        for (int i = 0; i < FIRST_LENGTH; i++) {
            limit += FIRST_COMPETITION_RANKS[i];
            if (rank <= limit) {                        // 상금 받을 인원에 포함될 경우
                return FIRST_COMPETITION_PRIZES[i];
            }
        }
        return 0;       // 상금 인원에 포함 X
    }

    private static int secondCompetition(int rank) {
        if (rank == 0) return 0;
        int limit = 0;
        for (int i = 0 ; i < SECOND_LENGTH; i++) {
            limit += SECOND_COMPETITION_RANKS[i];
            if (rank <= limit) {                        // 상금 받을 인원에 포함될 경우
                return SECOND_COMPETITION_PRIZES[i];
            }
        }
        return 0;
    }

}
