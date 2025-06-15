package algo250615;

import java.io.*;
import java.util.*;

// 백준 - 소수 찾기 (브론즈 2)
public class Baek1978 {
    static boolean isPrime[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        checkPrimes(arr[arr.length - 1]);

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (isPrime[arr[i]]) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void checkPrimes(int num) {
        isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        // 2부터 시작하여 배수 제거
        for (int i = 2; i * i <= num; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = false;                 // 배수들은 소수가 아니기에 false로 처리
                }
            }
        }
    }
}
