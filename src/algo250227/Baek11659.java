package algo250227;

import java.io.*;
import java.util.*;

// 구간 합 구하기 4 - 실버 3
public class Baek11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 누적 합 계산
        int sum = 0;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int j = start - 1; j <= end - 1; j++) {
                sum += arr[j];
            }
            bw.write(String.valueOf(sum));
            bw.newLine();
            sum = 0;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
