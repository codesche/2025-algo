package algo251002;

import java.io.*;
import java.util.*;

// 백준 - 뱀과 사다리 게임 (골드 5), [14316 KB, 104 ms]
public class Baek16928 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());       // 사다리 수
        int M = Integer.parseInt(st.nextToken());       // 뱀 수

        int[] move = new int[101];          // 사다리/뱀 매핑 (도착 즉시 이동)
        for (int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            move[from] = to;
        }

        int[] dist = new int[101];
        Arrays.fill(dist, -1);

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        dist[1] = 0;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (cur == 100) {
                System.out.println(dist[cur]);
                return;
            }

            for (int d = 1; d <= 6; d++) {
                int next = cur + d;
                if (next > 100) {
                    continue;
                }

                if (move[next] != 0) {
                    next = move[next];      // 사다리/뱀 즉시 적용
                }

                if (dist[next] != -1) {
                    continue;           // 이미 더 빠르게 방문됨
                }

                dist[next] = dist[cur] + 1;
                queue.add(next);
            }
        }
    }
}
