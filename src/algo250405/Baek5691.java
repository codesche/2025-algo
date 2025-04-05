package algo250405;

import java.io.*;
import java.util.*;

// 백준 - 평균 중앙값 문제 (브론즈 3)
// C <= LO <= HI (LO는 입력으로 주어진 두 정수 중 작은 값, HI는 입력으로 주어진 두 정수 중 큰 값)
// 중앙값이 평균과 동일하려면, C = LO - (HI-LO) 가 되어야 함

public class Baek5691 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }

            sb.append(2 * a - b).append('\n');
        }

        System.out.print(sb);
    }
}
