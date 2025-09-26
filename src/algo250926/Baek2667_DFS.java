package algo250926;

import java.io.*;
import java.util.*;

// 백준 - 단지번호붙이기 (실버 1), [14148 KB, 112 ms]
public class Baek2667_DFS {

    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int count;                       // DFS에서 사용할 집 개수 카운터

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
                if (map[i][j] == 1 && !visited[i][j]) {
                    count = 0;      // 카운터 초기화
                    dfs(i, j);
                    complexes.add(count);
                }
            }
        }

        // 오름차순 정렬
        Collections.sort(complexes);

        // 결과 출력
        System.out.println(complexes.size());
        for (int cnt : complexes) {
            System.out.println(cnt);
        }

    }

    static void dfs(int x, int y) {
        // 범위를 벗어나면 종료
        if (x < 0 || x >= n || y < 0 || y >= n) {
            return;
        }

        // 집이 없거나 이미 방문했다면 종료
        if (map[x][y] == 0 || visited[x][y]) {
            return;
        }

        visited[x][y] = true;
        count++;                    // 집 개수 증가

        // 상하좌우 탐색
        dfs(x - 1, y);          // 상
        dfs(x + 1, y);          // 하
        dfs(x, y - 1);          // 좌
        dfs(x, y + 1);          // 우
    }

}
