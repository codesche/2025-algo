package algo250206;

import java.io.*;
import java.util.*;

// 기상캐스터 - 실버 5
public class Baek10709 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // H, W 입력
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int count = 0;      // c가 나올 때마다 초기화 시켜줌
        for (int i = 0; i < H; i++) {
            String str = br.readLine();

            // 문자마다 비교하기
            for (int j = 0; j < W; j++) {
                if (str.charAt(j) == '.' && count == 0) {
                    bw.write(-1 + " ");
                } else if (str.charAt(j) == 'c') {
                    bw.write(0 + " ");
                    count = 1;
                } else if (str.charAt(j) == '.' && count != 0) {
                    bw.write(count + " ");
                    count++;
                }
            }
            count = 0;
            bw.write("\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
