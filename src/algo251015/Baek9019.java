package algo251015;

// 백준 - DSLR (골드 4)
import java.io.*;
import java.util.*;

public class Baek9019 {

    static final int MAX = 10000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());

        // 재할당 비용 절감: 배열 재사용
        int[] prev = new int[MAX];         // 이전 상태
        char[] how = new char[MAX];        // 어떤 연산으로 왔는지
        boolean[] visited = new boolean[MAX];
        int[] q = new int[MAX];            // 고정 배열 큐 (성능↑)

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            // 초기화
            Arrays.fill(visited, false);
            Arrays.fill(prev, -1);         // -1이면 미방문으로 사용
            // how는 prev로 방문 여부 판단하므로 초기화 불필요(해도 무방)

            // BFS
            int head = 0, tail = 0;
            q[tail++] = A;
            visited[A] = true;

            while (head < tail && !visited[B]) {
                int cur = q[head++];

                // D
                int d = (cur << 1) % 10000; // (cur * 2) % 10000
                if (!visited[d]) {
                    visited[d] = true;
                    prev[d] = cur;
                    how[d] = 'D';
                    q[tail++] = d;
                }

                // S
                int s = (cur == 0 ? 9999 : cur - 1);
                if (!visited[s]) {
                    visited[s] = true;
                    prev[s] = cur;
                    how[s] = 'S';
                    q[tail++] = s;
                }

                // L
                int l = (cur % 1000) * 10 + (cur / 1000);
                if (!visited[l]) {
                    visited[l] = true;
                    prev[l] = cur;
                    how[l] = 'L';
                    q[tail++] = l;
                }

                // R
                int r = (cur % 10) * 1000 + (cur / 10);
                if (!visited[r]) {
                    visited[r] = true;
                    prev[r] = cur;
                    how[r] = 'R';
                    q[tail++] = r;
                }
            }

            // 경로 복원
            StringBuilder path = new StringBuilder(32);
            for (int x = B; x != A; x = prev[x]) {
                path.append(how[x]);
            }
            out.append(path.reverse()).append('\n');
        }

        System.out.print(out.toString());
    }
}

