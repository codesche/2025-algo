package algo250804;

import java.io.*;
import java.util.*;

// 백준 - 웰컴 키트 (브론즈 3)

/**
 * 티셔츠 한 장, 펜 한 자루
 * S, M, L, XL, XXL, XXXL의 6가지 사이즈가 있음
 * 티셔츠는 같은 사이즈의 T장 묶음으로만 이루어져 있음
 */
public class Baek30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());                        // 23

        int[] shirts = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) { // 3 1 4 1 5 9
            shirts[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());       // 5
        int p = Integer.parseInt(st.nextToken());       // 7

        // 목표: 티셔츠를 t장씩 최소 몇 묶음 주문? (7)
        // 펜을 p자루씩 최대 몇 묶음 주문, 그때 펜을 한 자루에 몇 개씩 주문? (3 2)
        long tshirtBundles = 0;
        for (int s : shirts) {
            // (s + t - 1) / t 방식으로 올림
            tshirtBundles += (s + t - 1) / t;
        }

        // N명에게 정확하게 1자루씩 주어져야 함
        long penBundles = n / p;        // 자루
        long penSingles = n % p;        // 갯수

        System.out.println(tshirtBundles);
        System.out.println(penBundles + " " + penSingles);
    }
}
