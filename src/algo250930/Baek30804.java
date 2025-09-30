package algo250930;

import java.io.*;
import java.util.*;

// 백준 - 과일 탕후루 (실버 2), [38160 KB, 404 ms]
public class Baek30804 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] fruits = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }

        // 빈도 관리용 맵(과일 값 범위가 명확하더라도, 일반적으로 안전하게 HashMap 사용)
        Map<Integer, Integer> count = new HashMap<>();

        int left = 0;
        int distinct = 0;           // 현재 구간 내 서로 다른 과일 개수
        int ans = 0;

        for (int right = 0; right < N; right++) {
            // fruits[right] 추가
            count.put(fruits[right], count.getOrDefault(fruits[right], 0) + 1);

            if (count.get(fruits[right]) == 1) {
                distinct++;
            }

            // 서로 다른 과일이 2개를 초과하면 left를 이동하며 축소
            while (distinct > 2) {
                int lv = fruits[left++];
                int cnt = count.get(lv) - 1;
                if (cnt == 0) {
                    count.remove(lv);
                    distinct--;
                } else {
                    count.put(lv, cnt);
                }
            }

            // 조건을 만족하는 최대 길이 갱신
            ans = Math.max(ans, right - left + 1);
        }

        System.out.println(ans);
    }
}
