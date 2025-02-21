package algo250221;

import java.io.*;
import java.util.*;

// 지능형 기차 (브론즈 3)
public class Baek2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = Integer.MIN_VALUE;
        int total = 0;

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int rideOff = Integer.parseInt(st.nextToken());
            int ride = Integer.parseInt(st.nextToken());

            total += ride - rideOff;

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
