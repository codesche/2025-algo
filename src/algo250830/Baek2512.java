package algo250830;

import java.io.*;
import java.util.*;

// 백준 - 예산 (실버 2)
public class Baek2512 {

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

    public static void main(String[] args) throws IOException {
        int n = nextInt();

        int[] depo = new int[n];
        long sum = 0;
        int maxReq = 0;
        for (int i = 0; i < n; i++) {
            depo[i] = nextInt();
            sum += depo[i];
            if (depo[i] > maxReq) {
                maxReq = depo[i];
            }
        }

        long m = nextLong();

        // 전체 요청합이 총 예산 이하면 최댓값 그대로 배정
        if (sum <= m) {
            System.out.println(maxReq);
            return;
        }

        int low = 0;
        int high = maxReq;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long allocated = 0;
            for (int req : depo) {
                allocated += (req < mid ? req : mid);
                // 조기 중단: 이미 m을 넘으면 더 볼 필요도 없음
                if (allocated > m) {
                    break;
                }
            }

            if (allocated <= m) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }

}
