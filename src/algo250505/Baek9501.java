package algo250505;

import java.io.*;
import java.util.*;

// 백준 - 꿍의 우주여행 (브론즈 3)
// 핵심: 연료와 도착시간
// 여러 대의 우주선 - 최고속도, 연료소비율(연비) 이 조금씩 다름
// 모든 우주선이 최고속도에 즉시 도달한다고 할 때 목적지까지 여행할 수 있는 우주선이 총 몇 대?
// 입력 - 테스트 케이스 -> N, D -> vi, fi, ci
public class Baek9501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            // 우주선의 개수(n), 거리(d) 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            double d = Integer.parseInt(st.nextToken());

            int count = 0;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                double vi = Integer.parseInt(st.nextToken());       // 우주선 최고속도
                double fi = Integer.parseInt(st.nextToken());       // 우주선 연료양
                double ci = Integer.parseInt(st.nextToken());       // 우주선 연료소비율

                // d / vi = d미터 이동하는데 걸린 시간 (t)
                // t * ci(시간당 소비 연료) => d만큼 이동하는데 소비되는 연료량
                // 즉, d만큼 이동하는데 소비되는 연료량이 현재 연료량보다 작거나 같으면 됨
                if (d / vi * ci <= fi) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
