package algo250827;

import java.io.*;
import java.util.*;

// 백준 - 공유기 (골드 4)
public class Baek2110 {

    // 성능 고려한 입출력 제어
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static int N;
    static int C;
    static long[] pos;

    public static void main(String[] args) throws IOException {
        // 입력 받기
        N = nextInt();
        C = nextInt();

        // 집의 좌표 입력 받기
        pos = new long[N];
        for (int i = 0; i < N; i++) {
            pos[i] = nextLong();
        }

        // 제대로 된 비교를 위해 정렬
        Arrays.sort(pos);

        // 최소 간격을 먼저 정함 (길이는 0이 될 수 없으므로)
        long lo = 1;

        // 가능한 최대 간격 (정해버림)
        long hi = pos[N - 1] - pos[0];

        // 정답 변수
        long ans = 0;

        while (lo <= hi) {
            long mid = (lo + hi) >>> 1;
            if (canPlace(mid)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        System.out.println(ans);
    }

    static boolean canPlace(long distance) {
        long last = pos[0];
        int count = 1;            // 첫 집에 공유기를 설치
        for (int i = 1; i < N; i++) {
            // 조건
            // 거리가 주어졌을 때 그 간격 이상으로 공유기를 C개 이상
            // 놓을 수 있는 distance는 가능
            if (pos[i] - last >= distance) {
                count++;
                last = pos[i];

                if (count >= C) {
                    return true;        // 충분히 설치 가능
                }
            }
        }
        return false;
    }
}
