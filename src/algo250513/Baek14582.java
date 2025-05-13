package algo250513;

import java.io.*;
import java.util.*;

// 백준 - 오늘도 졌다 (브론즈 1)
public class Baek14582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[9];
        for (int i = 0; i < 9; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] B = new int[9];
        for (int i = 0; i < 9; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int aScore = 0;
        int bScore = 0;
        boolean win = false;
        for (int i = 0; i < 9; i++) {
            aScore += A[i];
            if (aScore > bScore) {
                win = true;
            }

            bScore += B[i];
        }

        if (aScore < bScore && win) {
            sb.append("Yes");
        } else {
            sb.append("No");
        }

        System.out.print(sb);
    }
}
