package algo250905;

import java.io.*;
import java.util.*;

// 백준 - 강의실 배정 (골드 4)
public class Baek11000 {

    static int n;
    static long s;
    static long t;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        n = Integer.parseInt(br.readLine());

        // 배열 생성
        long[][] intervals = new long[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            t = Integer.parseInt(st.nextToken());

            intervals[i][0] = s;
            intervals[i][1] = t;
        }

        // 시작 시간을 기준으로 정렬
        Arrays.sort(intervals, (a, b) -> Long.compare(a[0], b[0]));

        // 우선순위 큐 생성
        PriorityQueue<Long> pq = new PriorityQueue<>();

        // 생성한 배열 순회 -> 향상된 for문으로
        for (long[] iv : intervals) {
            s = iv[0];
            t = iv[1];

            if (!pq.isEmpty() && pq.peek() <= s) {
                pq.poll();
            }

            pq.offer(t);
        }

        bw.write(String.valueOf(pq.size()));
        bw.flush();
        bw.close();
    }
}
