package algo250225;

import java.io.*;
import java.util.*;

// 터렛 - 실버 3
public class Back1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(answer(x1, y1, r1, x2, y2, r2)).append('\n');
        }
        System.out.println(sb);
    }

    // 접점 개수 구하기
    public static int answer(int x1, int y1, int r1, int x2, int y2, int r2) {
        int distance = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));      // 중점간 거리

        // 중점이 같으면서 반지름도 같은 경우(case 1)
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        } else if (distance > Math.pow(r1 + r2, 2)) {           // 두 원의 반지름의 합보다 중점간 거리가 더 긴 경우(case 2-1)
            return 0;
        } else if (distance < Math.pow(r2 - r1, 2)) {           // 원 안에 원이 있느나 내접하지 않을 때(case 2-2)
            return 0;
        } else if (distance == Math.pow(r2 - r1, 2)) {          // 내접하는 경우(case 3-1)
            return 1;
        } else if (distance == Math.pow(r1 + r2, 2)) {          // 외접하는 경우(case 3-2)
            return 1;
        } else {
            return 2;
        }
    }

}
