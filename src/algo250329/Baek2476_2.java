package algo250329;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 백준 - 주사위게임 (브론즈 3)
public class Baek2476_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int max = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int total = 0;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == b && b == c) {
                total = 10000 + a * 1000;
            } else if (a == b || a == c) {
                total = 1000 + a * 100;
            } else if (b == c) {
                total = 1000 + b * 100;
            } else {
                int temp = Math.max(a, b);
                int maxValue = Math.max(temp, c);
                total = maxValue * 100;
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
