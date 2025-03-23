package algo250323;

import java.io.*;
import java.math.BigInteger;

// 백준 - 나머지와 몫이 같은 수 (브론즈 1)
// N = 3 일 때, 나머지와 몫이 모두 같은 수 - 4, 8
public class Baek1834 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (n + 1) * i;
        }

        System.out.println(sum);
    }
}
