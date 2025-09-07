package algo250907;

import java.util.*;
import java.io.*;

// 백준 - List of Unique Numbers (골드 4)
public class Baek13144 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 숫자 -> 마지막 등장 인덱스
        Map<Integer, Integer> lastPos = new HashMap<>();

        int left = 0;           // 윈도우 시작
        long ans = 0;           // 중복 없는 부분수열의 개수

        for (int right = 0; right < N; right++) {
            int x = arr[right];

            if (lastPos.containsKey(x)) {
                // 해당 원소를 포함하지 않도록 left를 전진시킴
                left = Math.max(left, lastPos.get(x) + 1);
            }

            lastPos.put(x, right);

            // 현재 윈도우 내에서 끝점이 right인 모든 부분수열의 개수
            ans += (right - left + 1);
        }

        System.out.println(ans);
    }

}
