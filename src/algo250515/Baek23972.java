package algo250515;

import java.io.*;
import java.util.*;

// 백준 - 악마의 제안 (브론즈 3)
public class Baek23972 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long K = Long.parseLong(st.nextToken());        // 지불 금액
        long N = Long.parseLong(st.nextToken());        // 남은 금액 N배

        // 공식 유도
        /*
            (X - K) * N >= X
            (X - K) * N - X >= 0
            XN - KN - X >= 0
            (N - 1)X - KN >= 0
            (N - 1)X >= KN
            X >= K * N / (N - 1)
         */

        // 0을 나눌 수 없다는 것을 대비
        if (N == 1) {
            System.out.println(-1);
        } else {
            long div = K * N / (N - 1);
            long mod = K * N % (N - 1);
            System.out.println(div + (mod > 0 ? 1 : 0));
        }
    }
}
