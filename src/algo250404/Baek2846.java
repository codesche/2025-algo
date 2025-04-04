package algo250404;

import java.io.*;
import java.util.StringTokenizer;

// 백준 - 오르막길 (브론즈 1)
public class Baek2846 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        int temp = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i]) {
                temp += (arr[i] - arr[i - 1]);
            } else {
                temp = 0;           // 초기화
            }

            answer = Math.max(temp, answer);
        }
        System.out.println(answer);
    }
}
