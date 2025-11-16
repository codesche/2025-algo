package algo251116;

import java.io.*;
import java.util.*;

/**
 * 상황:
 * 1. 밤고는 100원 동전을 N개 갖고 있음
 * 2. 그 돈으로 M원인 초코바를 사 먹으려고 함
 *
 * 조건:
 * 1. 밤고가 가진 돈이 초코바의 가격 이상인 경우 밤고는 초코바를 살 수 있다.
 * 2. 100 * N >= M
 * 3. 1 <= N <= 100
 * 4. 1 <= M <= 10000
 * 5. 조건을 고려했을 때 int를 사용해도 무방함
 *
 * 입력:
 * 1. N과 M이 공백을 사이에 두고 주어짐
 *
 * 출력:
 * 1. 범고가 초코바를 살 수 있으면 Yes, 없으면 No를 출력
 *
 */

// 백준 - 초코바 (브론즈 5)
public class Baek27959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 출력 위한 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        // 공백을 위한 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());       // 100원짜리 동전의 갯수
        int M = Integer.parseInt(st.nextToken());       // 초코바의 가격

        // 100 * N >= M
        if (100 * N >= M) {
            sb.append("Yes");
        } else {
            sb.append("No");
        }

        System.out.println(sb);
    }
}
