package algo250502;

import java.io.*;
import java.util.*;

// 백준 - TGN (브론즈 3)
/*
광고를 해야 하는 경우 (광고를 했을 때의 수익 > 광고 비용)
광고를 해도 수익의 차이가 없는 경우 (광고를 했을 때의 수익 - 광고 비용 = 현재 수익)
광고를 하면 안 되는 경우 (광고를 할 때의 수익 - 광고 비용 < 현재 수익)
 */
public class Baek5063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());        // 테스트 케이스
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());       // 광고를 하지 않았을 때의 수익 (현재 수익)
            int e = Integer.parseInt(st.nextToken());       // 광고를 했을 때의 수익
            int c = Integer.parseInt(st.nextToken());       // 광고 비용

            if (e - c > r) {
                sb.append("advertise").append("\n");
            } else if (e - c == r) {
                sb.append("does not matter").append("\n");
            } else if (e - c < r) {
                sb.append("do not advertise").append("\n");
            }
        }

        System.out.print(sb);
    }
}
