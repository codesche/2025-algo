package algo250611;

import java.io.*;
import java.util.*;

// 백준 - The candy war(실버 5)
public class Baek9037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] C = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                C[j] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            while (true) {
                C = checkCandy(C);      // 사탕 짝수개 맞춘다.
                if (isSameCandy(C)) {
                    break;
                }
                C = roundCandy(C);
                count++;
            }

            System.out.println(count);
        }
    }

    // 사탕 짝수개로 맞추기
    private static int[] checkCandy(int[] candies) {

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] % 2 == 1) {
                candies[i]++;
            }
        }

        return candies;
    }

    // 모든 학생의 사탕 개수 같게 하기
    private static boolean isSameCandy(int[] candies) {
        for (int candy : candies) {
            // 모든 사탕은 같아야 하므로
            if (candy != candies[0]) {
                return false;
            }
        }
        return true;
    }

    // 사탕 순환
    private static int[] roundCandy(int[] candies) {

        int length = candies.length;
        int[] newCandies = new int[length];

        for (int i = 0; i < length; i++) {
            // 맨끝에 있는 학생은 맨 처음 학생으로 줘야 하기에 뒤에 길이만큼 나눈 나머지로 처리
            newCandies[(i + 1) % length] = candies[i] / 2 + candies[(i + 1) % length] / 2;
        }

        return newCandies;
    }


}
