package algo250922;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

// 백준 - 최대 힙 (실버 2)
// 리팩토링 버전
// 최대 N개의 원소가 힙에 들어갈 수 있음 → O(N), 공간 복잡도
// 출력 버퍼(StringBuilder)도 최대 N줄 저장 → O(N), 공간 복잡도
// 시간 복잡도: O(N log N)
public class Baek11279_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 숫자의 순서를 반대로 뒤집어 최대 힙을 만든다.
        // 최소 힙인 경우 Integer.compare(a, b)
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                // pq.isEmpty() - O(1)
                // 힙에서 최댓값 꺼내기 - O(log n)
                // StringBuilder.append -> O(1)
                sb.append(pq.isEmpty() ? 0 : pq.poll()).append('\n');
            } else {
                pq.offer(x);            // O(log n)
            }
        }

        System.out.print(sb);
    }
}
