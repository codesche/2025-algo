package algo250617;

import java.io.*;
import java.util.*;

// 백준 - 줄세우기 (실버 5)
public class Baek10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());

        for (int i = 0; i < P; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int caseNumber = Integer.parseInt(st.nextToken());
            int[] heights = new int[20];
            for (int j = 0; j < 20; j++) {
                heights[j] = Integer.parseInt(st.nextToken());      // 학생 키 입력
            }

            List<Integer> line = new ArrayList<>();
            int moveCount = 0;

            for (int k = 0; k < 20; k++) {
                int current = heights[k];
                int insertPos = line.size();

                for (int l = 0; l < line.size(); l++) {
                    if (line.get(l) > current) {
                        insertPos = l;
                        break;
                    }
                }

                // 이동 횟수는 삽입 위치 이후에 있는 학생 수
                moveCount += (line.size() - insertPos);

                // 해당 위치에 삽입
                line.add(insertPos, current);
            }

            // 결과 출력
            System.out.println(caseNumber + " " + moveCount);
        }
    }
}
