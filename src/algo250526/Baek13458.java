package algo250526;

import java.io.*;
import java.util.*;

// 백준 - 시험 감독 (브론즈 2)
public class Baek13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());        // 시험장의 개수

        // 시험장
        int[] room = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            room[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());           // 총감독관 (상수)
        int C = Integer.parseInt(st.nextToken());           // 부감독관 - 여러 명 있어도 됨 (변수)

        long sum = N;
        for (int i = 0; i < N; i++) {
            int cur = room[i] - B;
            if (cur <= 0) continue;
            sum += cur / C + (cur % C == 0 ? 0 : 1);
        }

        System.out.println(sum);
    }

}
