package algo250314;

import java.io.*;
import java.util.*;

// 분산처리 - 브론즈 2
public class Baek1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int data = 1;

            // 일의 자리 숫자만 알면 되므로 (data %= 10)
            for (int j = 0; j < b; j++) {
                data *= a;
                data %= 10;
            }

            if (data == 0) {
                data = 10;
            }

            bw.write(String.valueOf(data));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
