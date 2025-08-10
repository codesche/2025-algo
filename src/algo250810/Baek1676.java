package algo250810;

import java.io.*;

// 백준 - 실버 5 (팩토리얼 0의 개수)
public class Baek1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (long p = 5; p <= n; p *= 5) {
            cnt += n / p;
        }
        System.out.println(cnt);
    }
}
