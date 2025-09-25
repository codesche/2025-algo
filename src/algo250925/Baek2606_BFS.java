package algo250925;

import java.io.*;
import java.util.*;

// 백준 - 바이러스 (실버 3) - BFS 풀이[100 ms, 14220 KB]
public class Baek2606_BFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        // 그래프 생성 (인접 리스트)
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        // BFS 실행
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        visited[1] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : graph[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
