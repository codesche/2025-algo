package algo250921;

import java.io.*;

// 백준 - 수들의 합 (실버 5)
public class Baek1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());

        long sum = 0;
        long n = 0;

        while (sum + (n + 1) <= S) {
            n++;
            sum += n;
        }

        System.out.println(n);
    }
}
