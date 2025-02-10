package algo250210;

import java.io.*;
import java.util.*;

// 덱을 활용

/*
동점 상황 발생 시
- 1팀이 최근 득점에 성공했을 경우 '1팀의 마지막 득점 시간 - 2팀의 처음 득점 시간'을 2팀의 총합 시간에 추가
- 2팀이 최근 득점 시, 반대로 1팀의 총합 시간에 추가
- 해당 팀의 총합 시간에 시간을 추가한 후 1팀과 2팀의 덱에 있는 모든 득점 시간을 삭제

N번 반복 후
각 팀의 덱 사이즈를 비교하여 덱 사이즈가 큰 팀에게 '총 게임시간 - 덱의 마지막 득점 시간'을
해당 팀의 총합 시간으로 추가한다
 */

public class Baek2852_2 {

    private static final int TOTAL_GAME_SECOND = 48 * 60;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> dq1 = new ArrayDeque<>();
        ArrayDeque<Integer> dq2 = new ArrayDeque<>();
        int total1 = 0;
        int total2 = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int team = Integer.parseInt(st.nextToken());
            int second = convertStringToSecond(st.nextToken());

            if (team == 1) {
                dq1.addLast(second);
                if (dq1.size() == dq2.size()) {     // 동점 발생
                    total2 += dq1.peekLast() - dq2.peekFirst();
                    dq1.clear();
                    dq2.clear();
                }
            } else {
                dq2.addLast(second);
                if (dq1.size() == dq2.size()) {     // 동점 발생
                    total1 += dq2.peekLast() - dq1.peekFirst();
                    dq1.clear();
                    dq2.clear();
                }
            }
        }

        if (dq1.size() > dq2.size()) {
            total1 += TOTAL_GAME_SECOND - dq1.peekFirst();
        } else if (dq2.size() > dq1.size()) {
            total2 += TOTAL_GAME_SECOND - dq2.peekFirst();
        }

        sb.append(convertSecondToString(total1)).append("\n").append(convertSecondToString(total2));
        System.out.println(sb);
    }

    private static String convertSecondToString(int totalTime) {
        int min = totalTime / 60;
        int second = totalTime % 60;

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d", min)).append(":").append(String.format("%02d", second));
        return sb.toString();
    }

    private static int convertStringToSecond(String timeString) {

        String[] time = timeString.split(":");
        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
    }

}
