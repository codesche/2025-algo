package algo251004;

import java.util.*;
import java.io.*;

// 백준 - 이중 우선순위 큐 (골드 4), [365068 KB, 2440 ms]
public class Baek7662 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /**
         * I n → 숫자 n을 삽입
         * D 1 → 최댓값 삭제
         * D -1 → 최솟값 삭제
         * 같은 값이 여러 번 들어올 수 있으니까, value를 개수(count) 로 저장.
         */
        int T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            int k = Integer.parseInt(br.readLine());
            TreeMap<Long, Integer> map = new TreeMap<>();

            for (int i = 0; i < k; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String comm = st.nextToken();
                long n = Long.parseLong(st.nextToken());

                if (comm.charAt(0) == 'I') {
                    map.put(n, map.getOrDefault(n, 0) + 1);
                } else {
                    if (map.isEmpty()) {
                        continue;
                    }
                    if (n == 1) {
                        Map.Entry<Long, Integer> e = map.lastEntry();
                        if (e.getValue() == 1) {
                            map.pollLastEntry();
                        } else {
                            map.put(e.getKey(), e.getValue() - 1);
                        }
                    } else {
                        Map.Entry<Long, Integer> e = map.firstEntry();
                        if (e.getValue() == 1) {
                            map.pollFirstEntry();
                        } else {
                            map.put(e.getKey(), e.getValue() - 1);
                        }
                    }
                }
            }

            if (map.isEmpty()) {
                sb.append("EMPTY\n");
            } else {
                sb.append(map.lastKey()).append(' ').append(map.firstKey()).append('\n');
            }
        }

        System.out.print(sb);
    }

}
