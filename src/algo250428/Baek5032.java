package algo250428;

import java.io.*;
import java.util.*;

// 백준 - 탄산 음료 (브론즈 2)
// 빈 병의 수 e, 길에서 발견한 빈 병의 수 f, 새 병으로 바꾸는데 필요한 빈 병의 개수 c
// 9 0 3 => 4
public class Baek5032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int sum = e + f;
        int ans = 0;
        while (sum >= c) {
            int current = sum / c;          // 현재 마실 수 있는 음료수
            ans += current;
            sum = current + (sum % c);      // 이전에 교환해서 마신 음료수 + 빈병
        }

        System.out.println(ans);
    }
}
