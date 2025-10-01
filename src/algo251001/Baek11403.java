package algo251001;

import java.io.*;
import java.util.*;

// 백준 - 경로 찾기 (실버 1), [15940 KB, 164 ms]
public class Baek11403 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine().trim());
        int[][] g = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                g[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 플로이드-워셜
        for (int k = 0; k < N; k++) {           // 중간 정점
            for (int i = 0; i < N; i++) {       // 시작 정점
                if (g[i][k] == 0) {             // 작은 가지치기 (i -> k 없으면 j 검사 생략)
                    continue;
                }

                for (int j = 0; j < N; j++) {
                    if (g[k][j] == 1) {
                        g[i][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(g[i][j]);
                if (j + 1 < N) {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }

}
