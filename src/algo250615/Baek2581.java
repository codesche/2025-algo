package algo250615;

import java.io.*;
import java.util.*;

// 백준 - 소수 (브론즈 2)
// 소수 - 1보다 크면서 1과 자기 자신만을 약수로 갖는 자연수
public class Baek2581 {
    static boolean[] isPrime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());        // m, 60
        int n = Integer.parseInt(br.readLine());        // n, 100

        List<Integer> list = new ArrayList<>();

        checkPrimes(n);

        // m이상 n이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는다.
        for (int i = m; i <= n; i++) {
            if (isPrime[i]) {
                list.add(i);
            }
        }

        Collections.sort(list);

        if (!list.isEmpty()) {
            int total = list.stream().mapToInt(Integer::intValue).sum();
            sb.append(total).append("\n").append(list.get(0));
        } else {
            sb.append("-1");
        }

        System.out.println(sb);
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
                    isPrime[j] = false;
                }
            }
        }
    }

}
