package algo251011;

import java.io.*;
import java.util.*;

// 백준 - 테트로미노 (골드 4), [31060 KB, 328 ms]
public class Baek14500 {

    static int N;
    static int M;
    static int[][] A;
    static boolean[][] visited;
    static int answer = 0;

    // 상하좌우
    static final int[] dr = {-1, 1, 0, 0};
    static final int[] dc = {0, 0, -1, 1};

    // 가지치기용: 격자 내 최댓값
    static int maxCell;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N][M];
        visited = new boolean[N][M];
        maxCell = 0;

        // 행과 열을 순회
        for (int r = 0; r < N; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < M; c++) {
                A[r][c] = Integer.parseInt(st.nextToken());
                maxCell = Math.max(maxCell, A[r][c]);
            }
        }

        // 모든 칸을 시작점으로 시도
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                visited[r][c] = true;
                dfs(r, c, 1, A[r][c]);          // 깊이 1(이미 현재 칸 사용)
                visited[r][c] = false;

                checkT(r, c);                   // 'ㅗ' 모양 4가지 방향 검사
            }
        }

        System.out.println(answer);
    }

    // 깊이 4까지 이어붙이는 DFS (일반적인 테트로미노 처리)
    private static void dfs(int r, int c, int depth, int sum) {
        // 가지치기: 남은 칸을 모두 maxCell로 채워도 answer를 못 넘으면 중단
        if (sum + maxCell * (4 - depth) <= answer) {
            return;
        }

        if (depth == 4) {
            answer = Math.max(answer, sum);
            return;
        }

        for (int d = 0; d < 4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr < 0 || nr >= N || nc < 0 || nc >= M) {
                continue;
            }

            if (visited[nr][nc]) {
                continue;
            }

            visited[nr][nc] = true;
            dfs(nr, nc, depth + 1, sum + A[nr][nc]);
            visited[nr][nc] = false;
        }
    }

    // ‘ㅗ’(T) 모양은 중심(r, c) 기준으로 4가지 방향을 직접 합산
    // ㅗ: 위 + 좌 +우, ㅜ: 아래 + 좌 + 우, ㅓ: 좌 + 위 + 아래, ㅏ: 우 + 위 + 아래
    private static void checkT(int r, int c) {
        // 각 케이스마다 범위가 유효하면 합을 계산
        // ㅗ (up + left + right)
        if (r - 1 >= 0 && c - 1 >= 0 && c + 1 < M) {
            int sum = A[r][c] + A[r - 1][c] + A[r][c - 1] + A[r][c + 1];
            answer = Math.max(answer, sum);
        }

        // ㅜ (down + left + right)
        if (r + 1 < N && c - 1 >= 0 && c + 1 < M) {
            int sum = A[r][c] + A[r + 1][c] + A[r][c - 1] + A[r][c + 1];
            answer = Math.max(answer, sum);
        }

        // ㅓ(left + up + down)
        if (c - 1 >= 0 && r - 1 >= 0 && r + 1 < N) {
            int sum = A[r][c] + A[r][c - 1] + A[r - 1][c] + A[r + 1][c];
            answer = Math.max(answer, sum);
        }

        // ㅏ(right + up + down)
        if (c + 1 < M && r - 1 >= 0 && r + 1 < N) {
            int sum = A[r][c] + A[r][c + 1] + A[r - 1][c] + A[r + 1][c];
            answer = Math.max(answer, sum);
        }
    }

}