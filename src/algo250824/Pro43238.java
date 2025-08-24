package algo250824;

import java.util.*;

// 프로그래머스 - 입국심사 (Lv3)
public class Pro43238 {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long lo = 0L;
        long hi = (long) times[times.length - 1] * n;
        long ans = hi;

        while (lo <= hi) {
            long mid = (lo + hi) >>> 1;

        }

        return ans;
    }

    // T분 안에 n명 이상 처리 가능?
    private boolean canFinish(long T, int[] times, int n) {
        long done = 0;
        for (int t : times) {
            done += T / t;
            if (done >= n) {
                return true;
            }
        }
        return false;
    }
}
