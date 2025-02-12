package algo250212;

import java.io.*;
import java.util.*;

// 소수 찾기 - 브론즈 II
public class Baek1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            boolean isPrime = true;
            int prime = Integer.parseInt(st.nextToken());

            if (prime == 1) {
                continue;
            }

            for (int i = 2; i <= Math.sqrt(prime); i++) {
                if (prime % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
