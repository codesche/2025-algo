package algo250806;

import java.io.*;
import java.util.*;

// 백준 - 이항 계수 1 (브론즈 1)
// nCk, 조합 구현
// nCk = n! / (k! * (n-k)!)
public class Baek11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(combination(n, k));
    }

    public static int combination(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static int factorial(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }

        return result;
    }


}
