package algo250830;

import java.io.*;
import java.util.*;

/**
 * BOJ 3079 - 입국심사
 * 아이디어: "시간 T 내에 처리 가능한 총 인원 ≥ N ?" 을 체크하는 단조성으로 T를 이분탐색 (최소 T).
 * - 탐색값: 시간 T (0 ~ maxTime * N)
 * - check(T): sum_i (T / time[i]) ≥ N ?
 * - 갱신: 가능하면 hi = T, 불가능하면 lo = T + 1  (lower_bound 패턴)
 * 주의: 모두 long 사용(곱/합이 1e18까지 커짐), 조기 종료로 오버플로/시간 절약
 */
// 백준 - 입국심사 (골드 5)
public class Baek3079 {

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

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static int M;       // 심사대(검사관) 수
    static long N;      // 처리해야 할 사람의 수
    static long[] t;    // 각 심사관의 1인 처리 시간

    public static void main(String[] args) throws IOException {
        // 입력
        M = nextInt();
        N = nextLong();

        t = new long[M];
        long maxT = 0;
        for (int i = 0; i < M; i++) {
            t[i] = nextLong();
            if (t[i] > maxT) {
                maxT = t[i];
            }
        }

        // 시간 T의 탐색 범위: [0, maxT * N]
        long lo = 0;
        long hi = maxT * N;

        // 최소 T를 찾는 lower_bound 이분탐색
        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            if (canProcess(mid)) {
                hi = mid;           // mid 시간 안에 N명 이상 처리 가능 -> 더 줄여봄
            } else {
                lo = mid + 1;
            }
        }

        // lo == hi: N명을 처리할 수 있는 최소 시간
        System.out.println(lo);
    }

    // 시간 'time' 안에 처리 가능한 총 인원이 N 이상인지 검사
    static boolean canProcess(long time) {
        if (time < 0) {
            return false;       // 방어적
        }

        long done = 0;
        for (long x : t) {
            done += time / x;       // 이 심사관이 time 동안 처리할 수 있는 인원

            if (done >= N) {
                return true;
            }
        }

        return false;
    }

}

