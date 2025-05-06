package algo250506;

import java.io.*;
import java.util.*;

// 백준 - 수빈이와 수열 (브론즈 2)
/*
a1 = b1
a2 = 2b2 - a1
a3 = 3b3 - (a1 + a2)
a4 = 4b4 - (a1 + a2 + a3)
a5 = 5b5 - (a1 + a2 + a3 + a4)
 */
public class Baek10539 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());      // 수열 B
        }

        int[] answer = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            answer[i] = (i + 1) * arr[i] - sum;
            sum += answer[i];
        }

        for (int number : answer) {
            System.out.print(number + " ");
        }
    }
}
