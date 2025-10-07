package algo251007;

import java.io.*;
import java.util.*;

// 백준 - 쉬운 최단거리 (실버 1), [48108 KB, 492 ms]
public class Baek14940 {

    static final int[] DR = {-1, 1, 0, 0};
    static final int[] DC = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());        // 행
        int M = Integer.parseInt(st.nextToken());        // 열

        int[][] map = new int[N][M];
        int[][] dist = new int[N][M];

        int sr = -1;
        int sc = -1;        // 시작점(값 2)

        for (int r = 0; r < N; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < M; c++) {
                map[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        // dist 초기화: 1인 칸은 -1(미방문), 0인 칸은 0, 2는 나중에 0 설정
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (map[r][c] == 1) {
                    dist[r][c] = -1;
                } else {
                    dist[r][c] = 0;
                }

                if (map[r][c] == 2) {
                    sr = r;
                    sc = c;
                }
            }
        }

        // BFS
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        dist[sr][sc] = 0;
        queue.add(new int[]{sr, sc});

        while (!queue.isEmpty()) {
            int[] cur = queue.pollFirst();
            int r = cur[0];
            int c = cur[1];

            for (int k = 0; k < 4; k++) {
                int nr = r + DR[k];
                int nc = c + DC[k];

                // 경계 체크
                if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;

                // 갈 수 있는 칸(1)이고 아직 미방문(dist==-1)인 경우만
                if (map[nr][nc] == 1 && dist[nr][nc] == -1) {
                    dist[nr][nc] = dist[r][c] + 1;
                    queue.addLast(new int[]{nr, nc});
                }
            }
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                sb.append(dist[r][c]).append(' ');
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}




















