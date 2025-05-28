package algo250528.baekjoon;

import java.io.*;
import java.util.*;

// 백준 - N번째 큰 수 (브론즈 1)
public class Baek2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[10];
            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int[] sortArr = Arrays.stream(arr).sorted().toArray();
            System.out.println(sortArr[7]);
        }
    }
}
