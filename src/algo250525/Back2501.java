package algo250525;

import java.io.*;
import java.util.*;

// 백준 - 약수 구하기 (브론즈 3)
public class Back2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N의 약수들 중 K번째로 작은 수
        // N % () == 0 => count == K => () 출력
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int count = 0;
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }

            if (count == K) {
                answer = i;
                break;
            }
        }

        System.out.println(answer != 0 ? answer : 0);
    }
}
