package algo250210;

import java.io.*;
import java.util.*;

// NBA 농구 - 실버 3
public class Baek2852 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 득점 횟수 입력
        int N = Integer.parseInt(br.readLine());

        // 1팀 점수
        int score1 = 0;

        // 2팀 점수
        int score2 = 0;

        // 최종적으로 리드 점수가 바뀐 시간
        int lastLeadChangeTime = 0;

        // 각 팀의 리드 시간
        int leadTime1 = 0;
        int leadTime2 = 0;

        // 농구 총 시간
        int endTime = 60 * 48;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int team = Integer.parseInt(st.nextToken());
            String[] time = st.nextToken().split(":");

            int scoreTime = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);

            if (score1 > score2) {
                leadTime1 += scoreTime - lastLeadChangeTime;
            } else if (score2 > score1) {
                leadTime2 += scoreTime - lastLeadChangeTime;
            }

            // 팀에 따라 score 점수 증가
            if (team == 1) {
                score1++;
            } else {
                score2++;
            }

            lastLeadChangeTime = scoreTime;
        }

        if (score1 > score2) {
            leadTime1 += endTime - lastLeadChangeTime;
        } else if (score2 > score1) {
            leadTime2 += endTime - lastLeadChangeTime;
        }

        // 분은 60으로 나누고, 초는 60을 나눈 나머지로 계산함
        int min1 = leadTime1 / 60;
        int sec1 = leadTime1 % 60;
        int min2 = leadTime2 / 60;
        int sec2 = leadTime2 % 60;

        bw.write(String.format("%02d:%02d\n", min1, sec1));
        bw.write(String.format("%02d:%02d\n", min2, sec2));

        bw.flush();
        bw.close();
        br.close();
    }
}
