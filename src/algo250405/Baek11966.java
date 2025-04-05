package algo250405;

import java.io.*;

// 백준 - 2의 제곱인가 (브론즈 3)
public class Baek11966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (true) {
            if (n % 2 != 0) {
                break;
            } else {
                n /= 2;
            }
        }

        int answer = (n == 1) ? 1 : 0;
        System.out.println(answer);
    }
}
