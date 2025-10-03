package algo251003;

import java.io.*;
import java.util.*;

// 백준 - 적록색약 (골드 5), [17404 KB, 152 ms]
// 박싱/언박싱 비용 고려,
// 객체 생성 고려
// 구현 길이 고려, 분기 비용 고려
// 반복형 BFS 고려
public class Baek10026 {

    static int N;
    static char[][] grid, gridCB;
    static boolean[][] vis1, vis2;
    static final int[] DR = {-1, 1, 0, 0};
    static final int[] DC = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        grid = new char[N][N];
        gridCB = new char[N][N];

        for (int row = 0; row < N; row++) {
            String line = br.readLine();
            for (int col = 0; col < N; col++) {
                char ch = line.charAt(col);
                grid[row][col] = ch;

                // 적록색약용: G를 R로 통합
                gridCB[row][col] = (ch == 'G') ? 'R' : ch;
            }
        }

        vis1 = new boolean[N][N];
        vis2 = new boolean[N][N];

        int normal = countAreas(grid, vis1);
        int colorBlind = countAreas(gridCB, vis2);

        System.out.println(normal + " " + colorBlind);
    }

    // 같은 로직을 두 그리드(일반, 적록색약)에 재사용

    /**
     *  시간복잡도: O(N^2) — 각 칸을 최대 한 번 방문
     *  공간복잡도: O(N^2) — visited 배열 및 큐의 최댓값(최대 N^2)
     *  - 큐에는 좌표쌍 (r,c)를 정수 하나(r*N + c)로 인코딩하여 저장 → 객체 생성 최소화
     *  - 매 영역 BFS마다 q.clear()로 큐를 재사용 → 불필요한 할당 줄임
     *  - 시작 색(color)을 캡처해 동일 색인지 비교 → 분기 단순화/분기 예측 유리
     * @param grid
     * @param visited
     * @return
     */
    static int countAreas(char[][] grid, boolean[][] visited) {
        int cnt = 0;
        ArrayDeque<Integer> queue = new ArrayDeque<>();     // 재사용 큐
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (visited[row][col]) {
                    continue;
                }

                cnt++;
                char color = grid[row][col];
                visited[row][col] = true;
                queue.clear();
                queue.add(row * N + col);

                // ---- BFS 시작: 같은 색으로 이어진 모든 칸을 방문 처리 ----
                while (!queue.isEmpty()) {
                    int p = queue.pollFirst();      // 큐 앞에서 하나 꺼내기(FIFO)
                    int cr = p / N;                 // 행 인덱스
                    int cc = p % N;                 // 열 인덱스

                    // 4방향 인접 칸 검사(상/하/좌/우)
                    for (int i = 0; i < 4; i++) {
                        int nr = cr + DR[i];
                        int nc = cc + DC[i];

                        // 경계 밖이면 무시(인덱스 범위 체크)
                        if (nr < 0 || nr >= N || nc < 0 || nc >= N) {
                            continue;
                        }

                        // 이미 방문한 칸이면 스킵
                        if (visited[nr][nc]) {
                            continue;
                        }

                        // 색이 다르면 같은 영역이 아니므로 스킵
                        if (grid[nr][nc] != color) {
                            continue;
                        }

                        // 이웃이 범위 내이고 아직 미방문임과 동시에 색도 같다면: 방문 처리 후 큐에 추가
                        visited[nr][nc] = true;
                        queue.addLast(nr * N + nc);     // addLast로 BFS의 너비 우선 유지
                    }
                }
                // ---- BFS 종료: 시작점과 연결된 같은 색의 모든 칸이 방문됨 → 영역 1개 완료 ----
            }
        }
        return cnt;             // 전체 영역 개수 반환
    }

}
