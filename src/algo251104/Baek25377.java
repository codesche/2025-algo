package algo251104;

import java.io.*;
import java.util.*;

// 백준 - 빵 (브론즈 4)
public class Baek25377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A <= B) {
                list.add(B);
            }
        }

        Collections.sort(list);     // 리스트 정렬

        System.out.println(list.isEmpty() ? -1 : list.get(0));
    }
}
