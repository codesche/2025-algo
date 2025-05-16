package algo250516;

import java.io.*;
import java.util.*;

// 백준 - 트럭 주차 (브론즈 2)
// 트록 총 3대
// 1분에 한 대당 A원, 두 대 주차시 1분에 한 대당 B원, 세 대 주차 시 1분에 한 대당 C원
public class Baek2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[103];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int arrTime = Integer.parseInt(st.nextToken());
            int leaTime = Integer.parseInt(st.nextToken());

            for (int j = arrTime; j < leaTime; j++) {
                arr[j]++;
            }
        }

        int total = 0;
        for (int i = 0; i < 100; i++) {
            if (arr[i] == 1) {
                total += a;
            } else if (arr[i] == 2) {
                total += b * 2;
            } else if (arr[i] == 3) {
                total += c * 3;
            }
        }

        System.out.println(total);
    }
}
