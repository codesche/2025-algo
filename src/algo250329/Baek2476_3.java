package algo250329;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

// 백준 - 주사위게임 (브론즈 3)
public class Baek2476_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int max = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[3];
            int total = 0;
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if (arr[0] == arr[1] && arr[1] == arr[2]) {
                total = 10000 + arr[0] * 1000;
            } else if (arr[0] == arr[1] || arr[0] == arr[2]) {
                total = 1000 + arr[0] * 100;
            } else if (arr[1] == arr[2]) {
                total = 1000 + arr[1] * 100;
            } else {
                Arrays.sort(arr);
                total = arr[2] * 100;
            }

            if (max < total) {
                max = total;
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }
}
