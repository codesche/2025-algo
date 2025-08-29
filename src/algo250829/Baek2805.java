package algo250829;

import java.util.*;
import java.io.*;

// 백준 - 나무자르기 (실버 2)
public class Baek2805 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static Long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static int N;
    static long M;

    public static void main(String[] args) throws IOException {
        // 입력
        N = nextInt();
        M = nextLong();

        int[] heights = new int[N];
        long hi = 0;
        for (int i = 0; i < N; i++) {
            heights[i] = nextInt();

            if (heights[i] > hi) {
                hi = heights[i];
            }
        }

        long lo = 0;
        long ans = 0;
        while (lo <= hi) {
            long mid = hi + (lo - hi) / 2;

            if (ok(heights, mid, M)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        System.out.println(ans);
    }

    // heights[]: 나무 높이 배열, cut: 절단 높이, need: 필요한 최소 나무 길이
    static boolean ok(int[] heights, long cut, long need) {
        long got = 0;
        for (int x : heights) {
            if (x > cut) {
                got += (x - cut);
                if (got >= need) {
                    return true;
                }
            }
        }
        return got >= need;
    }

}
