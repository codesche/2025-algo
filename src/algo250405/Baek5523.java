package algo250405;

import java.io.*;
import java.util.*;

// 백준 - 경기 결과 (브론즈 3)
public class Baek5523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int aWin = 0;
        int bWin = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a > b) {
                aWin++;
            } else if (a < b) {
                bWin++;
            }
        }

        bw.write(aWin + " " + bWin);
        bw.flush();
        bw.close();
        br.close();
    }
}
