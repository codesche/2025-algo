package algo250906;

import java.util.*;

// LeetCode - Number of Islands
public class LeetCode200 {

    /**
     * '1'은 육지, '0'은 물인 격자에서 섬(연결된 '1' 묶음)의 개수를 반환
     * 연결은 상/하/좌/우 4방향만 고려
     */
    public int solution(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int islandCount = 0;

        // 상하좌우 방향벡터
        int[][] dirs = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
        };

        // 모든 셀을 순회하며, 아직 방문되지 않은 육지('1')를 시작점으로 BFS 실행
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    continue;               // 물이거나 이미 방문 처리된 칸은 스킵
                }

                islandCount++;              // 새로운 섬 발견

                // 현재 섬에 속한 모든 칸을 한 번에 지워버리기(= 방문 처리) 위한 BFS
                Deque<int[]> queue = new ArrayDeque<>();
                queue.offer(new int[]{r, c});
                grid[r][c] = '0';                   // 방문 처리: 바로 물로 바꿔 재방문 방지

                while (!queue.isEmpty()) {
                    int[] cell = queue.poll();
                    int cr = cell[0];               // 현재 셀의 행
                    int cc = cell[1];               // 현재 셀의 열

                    // 4방향 이웃을 확인
                    for (int[] d : dirs) {
                        int nr = cr + d[0];         // 다음 셀의 행
                        int nc = cc + d[1];         // 다음 셀의 열

                        // 경계 안이면서 '1'(아직 방문 안 한 육지)이면 방문 처리 + 큐에 추가
                        if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == '1') {
                            grid[nr][nc] = '0';
                            queue.offer(new int[]{nr, nc});
                        }
                    }
                }
            }
        }
        return islandCount;
    }
}
