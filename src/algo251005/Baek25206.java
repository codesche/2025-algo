package algo251005;

import java.io.*;
import java.util.*;

// 백준 - 너의 평점은 (실버 5), [14608 KB, 120 ms]
public class Baek25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 20줄
        // 전공평점 - 과목별 (학점 x 과목평점) 의 합을 학점의 총합으로 나눈 값
        // => 3.0 * 4.5 + ... + / (3.0 + 3.0 ... )
        // 등급이 P인 과목은 계산에서 제외
        double totalScore = 0.0;        // 총 학점
        double mgba = 0.0;              // 전공평점
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) {
                continue;
            } else {
                switch (grade) {
                    case "A+":
                        mgba += score * 4.5;
                        break;
                    case "A0":
                        mgba += score * 4.0;
                        break;
                    case "B+":
                        mgba += score * 3.5;
                        break;
                    case "B0":
                        mgba += score * 3.0;
                        break;
                    case "C+":
                        mgba += score * 2.5;
                        break;
                    case "C0":
                        mgba += score * 2.0;
                        break;
                    case "D+":
                        mgba += score * 1.5;
                        break;
                    case "D0":
                        mgba += score * 1.0;
                        break;
                }

                totalScore += score;
            }
        }

        System.out.printf("%.4f", mgba / totalScore);
    }
}
