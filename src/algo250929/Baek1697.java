package algo250929;

import java.io.*;
import java.util.*;

// 백준 - 숨바꼭질 (실버 1), [16596 KB, 140 ms]
// BFS로 최소 시간(간선 가중치 1)을 계산.

/**
 * 무가중치 그래프의 최단 경로 → BFS가 정답.
 * 방문 배열로 중복 탐색을 막고, dist[x]에 최소 시간을 저장.
 *
 * 복잡도:
 * 시간: O(MAX) (최대 각 정점을 한 번씩 방문)
 * 공간: O(MAX) (visited, dist, 큐)
 *
 */

public class Baek1697 {

    private static final int MAX = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());       // 수빈 위치
        int K = Integer.parseInt(st.nextToken());       // 동생 위치

        // 뒤로만 가면 되는 경우(한 칸씩 -1)
        if (N >= K) {
            System.out.println(N - K);
            return;
        }

        // 방문 및 거리(시간) 배열
        boolean[] visited = new boolean[MAX + 1];
        int[] dist = new int[MAX + 1];

        // 큐: 현재 위치를 저장
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(N);
        visited[N] = true;
        dist[N] = 0;

        // BFS
        while (!queue.isEmpty()) {
            int cur = queue.poll();

            if (cur == K) {
                System.out.println(dist[cur]);
                return;
            }

            // 다음 위치 후보들
            int next1 = cur - 1;
            int next2 = cur + 1;
            int next3 = cur * 2;

            // 각 후보에 대해 범위/방문 체크 후 큐에 삽입
            if (next1 >= 0 && !visited[next1]) {
                visited[next1] = true;
                dist[next1] = dist[cur] + 1;
                queue.add(next1);
            }

            if (next2 <= MAX && !visited[next2]) {
                visited[next2] = true;
                dist[next2] = dist[cur] + 1;
                queue.add(next2);
            }

            if (next3 <= MAX && !visited[next3]) {
                visited[next3] = true;
                dist[next3] = dist[cur] + 1;
                queue.add(next3);
            }
        }
    }

}
