package algo250410;

import java.io.*;

// 백준 - 지각 (브론즈 3)
public class Baek10419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int d = Integer.parseInt(br.readLine());

            int max = 0;
            for (int j = 1; j <= d; j++) {
                if (j + (j * j) <= d) {
                    max = j;
                }
            }

            System.out.println(max);
        }
    }
}
