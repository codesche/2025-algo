package algo250201;

import java.io.*;
import java.util.*;

// 전구 - 브론즈 II (답은 맞았으나 틀렸습니다 뜸)
public class Baek21918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N, M 입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 전구 배열 선언
        int[] light = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            light[i] = Integer.parseInt(st.nextToken());
        }

        // 세 번째 줄 수행
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            switch (a) {
                case 1:
                    light[b - 1] = c;
                    break;
                case 2:
                    for (int j = b - 1; j <= c - b + 1; j++) {
                        if (light[j] == 1) {
                            light[j] = 0;
                        } else {
                            light[j] = 1;
                        }
                    }
                    break;
                case 3:
                    for (int j = b - 1; j <= c - b + 1; j++) {
                        if (light[j] == 1) {
                            light[j] = 0;
                        }
                    }
                    break;
                case 4:
                    for (int j = b - 1; j <= c - b + 1; j++) {
                        if (light[j] == 1) {
                            light[j] = 1;
                        }
                    }
                    break;
            }
        }

        for (int value : light) {
            bw.write(value + " ");
        }

        bw.flush();
        bw.close();
    }
}
