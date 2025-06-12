package algo250612;

import java.io.*;
import java.util.*;

// 백준 - 병영의 급식 (브론즈 2)
// X명이 한 판씩 받을 수 있도록 미리 부대의 인원을 X명 단위로 묶는다.
// 각 그룹에 속한 병사의 수가 X로 나누어 떨어진다면 행복하게 피자를 먹을 수 있다.
// 단, 둘 이상의 그룹에 속하거나 어떤 그룹에도 속하지 못한 생활관이 존재해선 안 됨.
public class Baek30204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] soldiers = new int[N];
        for (int i = 0; i < N; i++) {
            soldiers[i] = Integer.parseInt(st.nextToken());
        }

        int total = 0;
        for (int i = 0; i < N; i++) {
            total += soldiers[i];
        }

        // 분배 가능 여부 확인 - 나머지 값들을 더한 값을 기준값으로 나누었을 때 나머지가 없으면 1, 있으면 0
        if (total % X == 0) {
            bw.write(String.valueOf(1));
        } else {
            bw.write(String.valueOf(0));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
