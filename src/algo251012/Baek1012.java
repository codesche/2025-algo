package algo251012;

import java.io.*;
import java.util.*;

// 백준 - 유기농 배추 (실버 2), [16004 KB, 128 ms]
// O(N x M) - 모든 칸을 한 번씩만 탐색
public class Baek1012 {

    static int M;           // 가로
    static int N;           // 세로
    static int K;           // 배추 위치 개수

    static int[][] field;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());        // 테스트 케이스 개수

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            // 배추밭과 방문배열 초기화
            field = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[y][x] = 1;
            }

            int count = 0;          // 필요한 지렁이 개수

            // 밭 전체를 탐색하면서 배추가 있는 곳을 찾기
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    // 아직 방문하지 않은 배추 발견 시 BFS 수행
                    if (field[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);          // 연결된 배추들은 모두 방문처리를 한다.
                        count++;            // 한 번의 BFS = 한 마리 지렁이 필요
                    }
                }
            }

            System.out.println(count);
        }
    }

    private static void bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y, x});     // 시작 위치를 큐에 넣음
        visited[y][x] = true;           // 방문 처리

        while (!queue.isEmpty()) {
            int[] now = queue.poll();       // 현재 위치 꺼내기
            int cy = now[0];
            int cx = now[1];

            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int ny = cy + dy[i];
                int nx = cx + dx[i];

                // 범위 안에 있으면서
                if (ny >= 0 && ny < N && nx >= 0 && nx < M) {
                    // 배추가 있고 아직 방문하지 않았다고 한다면
                    if (field[ny][nx] == 1 && !visited[ny][nx]) {
                        visited[ny][nx] = true;
                        queue.add(new int[]{ny, nx});
                    }
                }
            }
        }
    }

}
