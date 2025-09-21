package algo250921;

import java.io.*;
import java.util.*;

// 백준 - N번째 큰 수 (브론즈 1)
// N은 항상 3이다!
public class Baek2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력
        int T = Integer.parseInt(br.readLine());

        // 반복문 순회
        for (int i = 0; i < T; i++) {
            // 배열 생성 - 배열 길이는 정해져 있음 (length = 10)
            int[] arr = new int[10];

            // 배열 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            // 배열 정렬 - Quick 정렬
            Arrays.sort(arr);

            System.out.println(arr[arr.length - 3]);
        }
    }
}
