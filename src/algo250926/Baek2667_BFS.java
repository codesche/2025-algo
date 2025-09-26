package algo250926;

import java.io.*;
import java.util.*;

// 백준 - 단지번호붙이기 (실버 1), [14416 KB, 112 ms]
public class Baek2667_BFS {

    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visited = new boolean[n][n];

        // 지도 입력 받기
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        List<Integer> complexes = new ArrayList<>();

        // 모든 좌표 순회
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 집이 있고 아직 방문하지 않았다면...
                if (map[i][j] == 1 && !visited[i][j]) {
                    int count = bfs(i, j);
                    complexes.add(count);
                }
            }
        }

        // 오름차순 정렬
        Collections.sort(complexes);

        // 결과 출력
        System.out.println(complexes.size());
        for (int count : complexes) {
            System.out.println(count);
        }
    }

    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        int count = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            // 상하좌우 탐색
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                // 범위 체크
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    // 집이 있고 방문하지 않았다면
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                        count++;
                    }
                }
            }
        }

        return count;
    }

}
