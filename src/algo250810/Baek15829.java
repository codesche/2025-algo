package algo250810;

import java.io.*;
import java.util.*;

// 백준 - Hashing (브론즈 2)
// a:1, b:2, c:3, d:4 .... z:26
// r = 31, M = 1234567891
public class Baek15829 {
    public static void main(String[] args) throws IOException {
        final long MOD = 1234567891L;
        final long R = 31L;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();

        long pow = 1L;
        long hash = 0L;

        for (char c : s) {
            int val = c - 'a' + 1;
            hash = (hash + val * pow) % MOD;
            pow = (pow * R) % MOD;
        }

        System.out.println(hash);
    }
}
