package algo250527;

import java.io.*;
import java.util.*;

// 백준 - 쉽게 푸는 문제 (브론즈 1)
// 1번은 한 번, 2번은 2번, 3번은 3번, 4번은 4번 ......
public class Baek1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] arr = new int[B];
        int idx = 0;

        Loop1 :
        for (int i = 1; i <= B; i++) {
            Loop2 :
            for (int j = 0; j < i; j++) {
                if (idx == B) {
                    break Loop2;
                } else {
                    arr[idx++] = i;
                }
            }

            if (idx == B) {
                break Loop1;
            }
        }

        int total = 0;
        for (int i = A; i <= B; i++) {
            total += arr[i - 1];
        }

        System.out.println(total);
    }
}
