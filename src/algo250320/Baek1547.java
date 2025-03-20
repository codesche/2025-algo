package algo250320;

import java.io.*;
import java.util.StringTokenizer;

// 백준 - 공 (브론즈 3)
public class Baek1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        int num = 1;                        // 공의 위치
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            if (X == num) {
                num = Y;
            } else if (Y == num) {
                num = X;
            }
        }

        System.out.println(num);
    }
}
