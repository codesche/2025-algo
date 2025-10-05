package algo251005;

import java.io.*;
import java.util.*;

// 백준 - 케빈 베이컨의 6단계 법칙 (실버 1), [14456 KB, 112 ms]
// 시간복잡도: O(N * (N + M))
// 공간복잡도: O(N + M)
public class Baek1389 {

    private static int N;
    private static int M;
    private static List<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];           // ArrayList도 이런 식으로 길이를 고정할 수 있음
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        int answer = 1;
        int bestSum = Integer.MAX_VALUE;

        for (int s = 1; s <= N; s++) {
            int sum = bfsSum(s);
            if (sum < bestSum) {
                bestSum = sum;
                answer = s;
            }
        }

        System.out.println(answer);

    }

    // 시작 정점 s에서 모든 정점까지의 최단거리 합
    private static int bfsSum(int s) {
        int[] dist = new int[N + 1];
        Arrays.fill(dist, -1);
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        dist[s] = 0;
        queue.add(s);

        while (!queue.isEmpty()) {
            int cur = queue.pollFirst();
            for (int next : graph[cur]) {
                if (dist[next] != -1) {
                    continue;
                }
                dist[next] = dist[cur] + 1;
                queue.addLast(next);
            }
        }

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (dist[i] == -1) {
                return Integer.MAX_VALUE / 2;       // 도달 불가 시 큰 값
            }
            sum += dist[i];
        }

        return sum;
    }
}
