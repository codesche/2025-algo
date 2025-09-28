package algo250928;

/*
 * 알고리즘 설명:
 *
 * 1. 문제 유형: 2D 그리드 그래프 탐색
 *    - 도연이의 위치에서 시작하여 갈 수 있는 모든 곳 탐색
 *    - 탐색 중 만나는 사람('P')의 수를 카운트
 *
 * 2. BFS vs DFS:
 *    - BFS: 큐를 사용, 메모리 더 사용하지만 최단 경로 보장
 *    - DFS: 재귀/스택 사용, 깊이가 깊으면 스택오버플로우 위험
 *    - 이 문제는 둘 다 가능하지만 BFS 추천
 *
 * 3. 구현 포인트:
 *    - 방향 배열(dx, dy) 사용으로 코드 간결화
 *    - visited 배열로 중복 방문 방지
 *    - 벽('X')은 통과 불가
 *
 * 4. 시간복잡도: O(N*M)
 *    - 모든 칸을 최대 한 번씩만 방문
 *    - BFS/DFS 모두 동일
 *
 * 5. 공간복잡도:
 *    - O(N*M): visited 배열
 *    - BFS의 경우 큐에 O(N*M) 추가 가능
 *    - DFS의 경우 재귀 깊이 O(N*M) 가능
*/

import java.io.*;
import java.util.*;

// 백준 - 헌내기는 친구가 필요해 (실버 2), [36529 KB, 320 ms]
public class Baek21736 {

    static int N, M;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[N][M];
        visited = new boolean[N][M];

        int startX = 0;
        int startY = 0;

        // 맵 입력 및 시작 위치 찾기
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'I') {
                    startX = i;
                    startY = j;
                }
            }
        }

        // BFS 로 탐색
        int result = bfs(startX, startY);

        System.out.println(result == 0 ? "TT" : result);
    }

    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];

            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                // 범위 체크
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                    continue;
                }

                // 방문했거나 벽인 경우
                if (visited[nx][ny] || map[nx][ny] == 'X') {
                    continue;
                }

                visited[nx][ny] = true;

                // 사람을 만난 경우
                if (map[nx][ny] == 'P') {
                    count++;
                }

                queue.offer(new int[]{nx, ny});
            }
        }

        return count;
    }

}


















