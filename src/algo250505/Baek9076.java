package algo250505;

import java.io.*;
import java.util.*;

// 백준 - 점수 집계 (브론즈 2)
public class Baek9076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        int[] arr = new int[5];
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            arr[3] = Integer.parseInt(st.nextToken());
            arr[4] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);

            int sum = arr[1] + arr[2] + arr[3];
            if (arr[3] - arr[1] >= 4) {
                sb.append("KIN");
            } else {
                sb.append(sum);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
