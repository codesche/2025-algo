package algo250914;

import java.io.*;
import java.util.*;

// 백준 - 소수 구하기 (실버 3)
public class Back1929 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        // 소수 판별할 boolean 배열이 필요
        boolean[] isPrime = new boolean[n + 1];

        // 2번부터 n번까지 모든 숫자를 소수로 가정하고 true로 초기화
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        // n의 제곱근까지 나눈다.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                // 현재 숫자 i가 소수인 경우, i의 배수들을 소수가 아니라고 명시!
                for (long j = (long) i * i; j <= n; j += i) {
                    isPrime[(int) j] = false;
                }
            }
        }

        // m부터 n까지 true인 것들만 출력
        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; i++) {
            if (isPrime[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb);
    }

}
