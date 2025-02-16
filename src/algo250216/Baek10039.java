package algo250216;

// 평균 점수 - 브론즈 5
/*
조건:
1. 기말고사 점수가 40점 이상인 학생들은 그 점수 그대로 자신의 성적이 됨
2. 40점 미만인 학생들은 보충학습을 듣는 조건을 수락하면 40점을 받게 됨
(=> 40점 미만인 학생들은 항상 40점을 받음, < 40 => 40)
 */

import java.io.*;

public class Baek10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int totalScore = 0;

        for (int i = 0; i < 5; i++) {
            int score = Integer.parseInt(br.readLine());
            if (score < 40) {
                score = 40;
            }
            totalScore += score;
        }

        bw.write(String.valueOf(totalScore / 5));
        bw.flush();
        bw.close();
        br.close();
    }
}
