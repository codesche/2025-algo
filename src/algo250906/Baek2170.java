package algo250906;

import java.io.*;
import java.util.*;

// 백준 - 선 긋기 (골드 5)
public class Baek2170 {

    static long x;
    static long y;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력
        n = Integer.parseInt(br.readLine());

        // 배열 생성
        long[][] lines = new long[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Long.parseLong(st.nextToken());
            y = Long.parseLong(st.nextToken());

            lines[i][0] = x;
            lines[i][1] = y;
        }

        // 시작점 기준으로 정렬하기
        Arrays.sort(lines, (a, b) -> Long.compare(a[0], b[0]));

        // 총 길이를 구할 리스트
        List<long[]> list = new ArrayList<>();

        // 기준 구간을 세우기
        long curStart = lines[0][0];
        long curEnd = lines[0][1];

        // 나머지 구간에 대하여 확인
        for (int i = 1; i < n; i++) {
            long nextStart = lines[i][0];
            long nextEnd = lines[i][1];

            // curEnd가 nextStart보다 크거나 같으면
            if (nextStart <= curEnd) {
                curEnd = Math.max(curEnd, nextEnd);
            } else {
                list.add(new long[]{curStart, curEnd});
                curStart = nextStart;
                curEnd = nextEnd;
            }
        }

        // 마지막 구간은 따로 추가해야 됨
        list.add(new long[]{curStart, curEnd});

        // 정답: 병합된 구간의 총 길이
        long total = 0;
        for (long[] seg: list) {
            total += (seg[1] - seg[0]);
        }

        System.out.println(total);
    }
}
