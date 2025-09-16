package algo250916;

import java.io.*;
import java.util.*;

// 백준 - 절댓값 힙 (실버 1)
public class Baek11286 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 연산의 개수가 주어짐
        int N = Integer.parseInt(br.readLine());

        // PriorityQueue에 사용자 정의 Comparator 전달
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                // 1. 절댓값 기준으로 먼저 비교
                int absA = Math.abs(a);
                int absB = Math.abs(b);
                if (absA == absB) {
                    // 2. 절댓값이 같다면 원래 값이 더 작은 것을 앞으로
                    return a - b;
                } else {
                    return absA - absB;
                }
            }
        );

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x != 0) {
                // x가 0이 아닌 경우 힙에 추가
                pq.add(x);
            } else {
                // x가 0이면 힙에서 꺼내야 함
                if (!pq.isEmpty()) {
                    // 조건에 맞는 최솟값 꺼내기
                    bw.write(pq.poll() + "\n");
                } else {
                    // 힙이 비어 있는 경우 0을 출력
                    bw.write("0\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
