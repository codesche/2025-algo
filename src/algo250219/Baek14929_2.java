package algo250219;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 시간초과 코드
public class Baek14929_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long sum = 0;                // 누적 합
        int start = 0;
        int end = start + 1;

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (end < N) {
            sum += arr[start] * arr[end];
            end++;

            if (end == N) {
                start++;
                end = start + 1;
            }
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
