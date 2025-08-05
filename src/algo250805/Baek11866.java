package algo250805;

import java.io.*;
import java.util.*;

// 백준 - 요세푸스 문제 0 (실버 4)
public class Baek11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        sb.append("<");

        // [1, 2, 3, 4, 5, 6, 7]
        while(!queue.isEmpty()) {
            // k - 1번 만큼 뽑아서 뒤로 다시 넣기
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }

            // k번째 사람 제거
            sb.append(queue.poll());
            if (!queue.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}
