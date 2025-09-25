package algo250925;

import java.io.*;
import java.util.*;

// 백준 - 바이러스 (실버 3) - DFS 풀이[104 ms, 14168 KB]
public class Baek2606_DFS {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        // 그래프 생성
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

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

        // DFS 실행 (1번 노드 방문 처리 후 시작)
        visited[1] = true;
        dfs(1);

        System.out.println(count);
    }

    static void dfs(int node) {
        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                count++;
                dfs(neighbor);
            }
        }
    }

}
