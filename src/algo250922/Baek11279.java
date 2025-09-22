package algo250922;

import java.io.*;
import java.util.*;

// 백준 - 최대 힙 (실버 2)
// 시간 복잡도 O(N log N), 공간 복잡도 O(N)
// 우선순위 큐에 최대 N개의 원소가 들어갈 수 있음 → O(N)
// 버퍼 입출력 사용은 상수 크기 → O(1)
public class Baek11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 숫자의 순서를 반대로 뒤집어 최대 힙을 만든다.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (pq.isEmpty()) {             // O(1)
                if (x == 0) {
                    bw.write(String.valueOf(x));
                    bw.newLine();
                } else {
                    pq.add(x);              // O(log n)
                }
            } else {
                if (x == 0) {
                    bw.write(String.valueOf(pq.poll()));        // O(log n)
                    bw.newLine();
                } else {
                    pq.add(x);
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
