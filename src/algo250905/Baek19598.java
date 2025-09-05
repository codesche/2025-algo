package algo250905;

import java.io.*;
import java.util.*;

// 백준 - 최소 회의실 개수 (골드 5)
public class Baek19598 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int n = Integer.parseInt(br.readLine());

        // 입력 받기 위한 2차원 배열 생성
        int[][] intervals = new int[n][2];

        int start = 0;
        int end = 0;

        for (int i = 0; i < intervals.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            intervals[i][0] = start;
            intervals[i][1] = end;
        }

        // 시작 시간 순으로 정렬
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // 최소 힙
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 조건 출력을 위한 반복문 순회
        for (int[] iv : intervals) {
            start = iv[0];
            end = iv[1];

            if (!pq.isEmpty() && pq.peek() <= start) {
                pq.poll();
            }

            // 종료시간은 큐에 추가
            pq.offer(end);
        }

        System.out.println(pq.size());
    }

}
