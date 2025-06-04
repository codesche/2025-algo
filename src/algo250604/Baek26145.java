package algo250604;

import java.io.*;
import java.util.*;

// 백준 - 출제비 재분배 (브론즈 3)
// N명의 출제자들, M명의 검수자들
// 출제자는 1번부터 N번까지의 (1 ~ N)
// 검수자는 N + 1번부터 N + M번까지 번호가 매겨짐 (N + 1 ~ N + M)
// N명의 출제자들에게 출제비가 지급
// i번 출제자 - Si
// 출제자들은 다른 운영자들에게 자신의 출제비 중 일부를 자유롭게 나눠줌
// i번 출제자는 j번 운영자에게 T원을 준다 => T(i, j)
// 각 출제자가 받는 출제비 S, 각자가 나눠주게 될 돈 T
// 운영자별로 얼마를 받게 될지 미리 계산

public class Baek26145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 받는 출제비를 배열로 만들기
        int[] arr = new int[N];

        // 값을 입력받음
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 나눠주는 돈 역시 배열로 만든 뒤, 입력받기
        int[][] shareMoney = new int[N][N + M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N + M; j++) {
                shareMoney[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 정답 배열
        int[] finalAmount = new int[N + M];
        for (int i = 0; i < N; i++) {
            finalAmount[i] = arr[i];
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N + M; j++) {
                finalAmount[j] += shareMoney[i][j];
                finalAmount[i] -= shareMoney[i][j];
            }
        }

        for (int i = 0; i < N + M; i++) {
            sb.append(finalAmount[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}
