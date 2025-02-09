package algo250209;

import java.io.*;
import java.util.*;

// 크로스 컨트리 - 실버 3
/*
 등수 저장용 int 배열 (ranks)
 각 팀별 인원 수 저장용 Map (cntMap)
 가장 큰 숫자의 팀 번호 저장용 int 변수
 해당 팀의 5번째 선수 저장용 배열 (fifth)
 팀별 최종 점수 저장용 Map (scoreMap)
 6명 이상인 팀 별로 몇 명 있는지에 대한 저장용 Map (tmpMap)
 가장 낮은 점수 저장용 int형 변수 (result)
 5번째 점수 저장용 int형 변수 (fifthScore)
 */

public class Baek9017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int[] answer = new int[T];

        // 테스트 케이스 입력
        // 1 2 3 3 1 3 2 4 1 1 3 1 3 3 1
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] ranks = new int[N];                           // N등까지 존재
            Map<Integer, Integer> cntMap = new HashMap<>();
            int teamNum = Integer.MIN_VALUE;                    // 가장 큰 번호의 팀

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                int value = Integer.parseInt(st.nextToken());

                // cntMap에 각 팀별 번호와 번호 수 추가
                cntMap.put(value, cntMap.getOrDefault(value, 0) + 1);
                ranks[j] = value;
                teamNum = Math.max(teamNum, value);
            }

            int[] fifth = new int[teamNum + 1];                 // 해당 팀의 5번째 선수 저장용 배열
            Map<Integer, Integer> scoreMap = new HashMap<>();
            Map<Integer, Integer> tmpMap = new HashMap<>();     // 팀별로 누적하여 점수 계산
            int score = 1;

            for (int r : ranks) {
                if (cntMap.get(r) == 6) {       // 팀원이 6명인 경우에만
                    tmpMap.put(r, tmpMap.getOrDefault(r, 0) + 1);

                    if (tmpMap.get(r) <= 4) {   // 해당 팀의 4등까지만 점수 기록
                        scoreMap.put(r, scoreMap.getOrDefault(r, 0) + score);
                    }

                    if (tmpMap.get(r) == 5) {   // 해당 팀의 5번째 선수의 점수
                        fifth[r] = score;
                    }

                    score++;
                }
            }

            int result = Integer.MAX_VALUE;         // 가장 낮은 점수
            int fifthScore = Integer.MAX_VALUE;     // 5번째 점수

            for (Integer key : scoreMap.keySet()) {
                int tmp = scoreMap.get(key);

                if (tmp < result) {                 // 점수가 가장 낮은 팀이 우승
                    result = tmp;
                    fifthScore = fifth[key];
                    answer[i] = key;
                } else if (tmp == result) {         // 점수가 동점일 경우, 5번째 선수의 점수가 낮은 팀이 우승
                    if (fifthScore > fifth[key]) {
                        answer[i] = key;
                    }
                }
            }
        }
        // 출력
        for (int value : answer) {
            bw.write(value + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
