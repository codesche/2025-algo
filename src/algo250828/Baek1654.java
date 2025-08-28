package algo250828;

import java.io.*;
import java.util.*;

// 백준 - 랜선 자르기 (실버 2)
public class Baek1654 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    // 토큰 소진시 새 줄을 읽어서 다시 토큰화
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

    public static void main(String[] args) throws IOException {
        int k = nextInt();
        long n = nextLong();
        long[] cable = new long[k];
        long hi = 0;        // 최대 랜선 길이

        for (int i = 0; i < k; i++) {
            cable[i] = nextLong();
            hi = Math.max(hi, cable[i]);
        }

        long lo = 1;        // 최소 길이
        long ans = 0;       // 최대로 자를 길이

        while (lo <= hi) {
            long mid = (lo + hi) >>> 1;
            if (count(cable, mid) >= n) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        System.out.println(ans);
    }

    static long count(long[] cable, long len) {
        long c = 0;

        // 각 cable에서 len 길이로 몇 개 나오는지 합산하기
        for (long x : cable) {
            c += x / len;
        }
        return c;
    }
}
