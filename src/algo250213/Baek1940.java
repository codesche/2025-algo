package algo250213;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

// 주몽 - 실버 5
public class Baek1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int length = arr.length;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int start = 0;
        int end = length - 1;

        Arrays.sort(arr);

        // 2 7 4 1 5 3 => 1 2 3 4 5 7
        while (start < end) {
            if (arr[start] + arr[end] < M) {
                start++;
            } else if (arr[start] + arr[end] > M) {
                end--;
            } else if (arr[start] + arr[end] == M) {
                start++;
                end--;
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
