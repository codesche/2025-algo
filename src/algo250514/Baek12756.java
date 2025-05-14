package algo250514;

import java.io.*;
import java.util.*;

// 백준 - 고급 여관 (브론즈 3)
// 공격력, 생명력
public class Baek12756 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] A = new int[2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        A[0] = Integer.parseInt(st.nextToken());        // A 공격력
        A[1] = Integer.parseInt(st.nextToken());        // A 생명력

        int[] B = new int[2];
        st = new StringTokenizer(br.readLine());
        B[0] = Integer.parseInt(st.nextToken());        // B 공격력
        B[1] = Integer.parseInt(st.nextToken());        // B 생명력

        while (true) {
            A[1] -= B[0];
            B[1] -= A[0];

            if (A[1] >= 1 && B[1] <= 0) {
                sb.append("PLAYER A");
                break;
            } else if (A[1] <= 0 && B[1] >= 1) {
                sb.append("PLAYER B");
                break;
            } else if (A[1] >= 1 && B[1] >= 1) {
                continue;
            } else {
                sb.append("DRAW");
                break;
            }
        }

        System.out.println(sb);
    }
}
