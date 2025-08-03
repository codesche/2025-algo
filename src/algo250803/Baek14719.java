package algo250803;

import java.io.*;
import java.util.*;

// 백준 - 빗물 (골드 5)
public class Baek14719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());       // 세로 높이
        int w = Integer.parseInt(st.nextToken());       // 가로 길이
        int[] blocks = new int[w];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < w; i++) {
            blocks[i] = Integer.parseInt(st.nextToken());
        }

        /*
        W = 1 → [3] → 벽 하나 → 물이 고일 수 없음
        W = 2 → [3, 1] → 두 벽이 붙어 있음 → 사이 공간이 없음
        W = 3 → [3, 0, 3] → 가운데 공간이 생김 → 물이 고일 수 있음
         */
        if (w < 3) {
            // 최소한 3칸은 되어야 가운데가 물을 가둘 수 있다
            System.out.println(0);
            return;
        }

        int[] leftMax = new int[w];
        int[] rightMax = new int[w];

        // 왼쪽 최대 높이 계산
        leftMax[0] = blocks[0];
        for (int i = 1; i < w; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], blocks[i]);
        }

        // 오른쪽 최대 높이 계산
        rightMax[w - 1] = blocks[w - 1];
        for (int i = w - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], blocks[i]);
        }

        // 빗물 변수 선언
        int water = 0;

        // 빗물 계산
        for (int i = 1; i < w - 1; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            if (minHeight > blocks[i]) {
                water += minHeight - blocks[i];
            }
        }

        System.out.println(water);
    }
}
